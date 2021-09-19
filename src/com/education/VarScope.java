package com.education;

class VarScope{
    static int x = 4, y;
    static{
        x = 44;
    }
    int a = 1, b;
    {
        b = 11;
    }
    void run(int b){
        a = b;
        int c;
        {
            // int c = 666; // INVALID
            int x = 444;
        }
        for (int d = 0; d < 3; d++){
            // int a = 3; // INVALID
            int e = 5;
            e++;
            System.out.println("e = " + e); // раз за разом печатает 6
        }
    }
    public static void main(String[] args) {
        int a = 3;
        new VarScope().run(a);
    }
}

