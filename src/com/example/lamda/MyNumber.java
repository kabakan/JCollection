package com.example.lamda;

/**
 * Created by Kanat KB on 28.08.2017.
 */


public interface MyNumber {
    double getValue();
}

interface NumericTest {
    int func(int n, int i);
}

interface MyFunc<T> {
    MyClass<T> func(T n);
}

class MyClass<T> {
    private T val;

    MyClass(T v) {
        val = v;
    }

    ;

    MyClass() {
        val = null;
    }

    ;

    T getVal() {
        return val;
    }

    ;
}

interface StringFunc {
    String func(String n);
}

class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    String strReverse2(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

class LamdaDemo {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    static String stringOp2(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(final String[] args) {
        /* переменная лямда */
        MyNumber myNum = () -> 123.45;
        System.out.println("getValue: " + myNum.getValue());

        /* блочная лямда */
        int num = 1;
        NumericTest numTest = (x, y) -> {
            int result = 0;
            result = x * y + num;
            return result;
        };
        System.out.println("func: " + numTest.func(2, 7));

        /* Консрукторы обобщенного класса лямда*/
        MyFunc<String> myClassCons = MyClass<String>::new;
        ;
        MyClass<String> mc = myClassCons.func("Fly 100");
        System.out.println("Значание = " + mc.getVal());

        /*Ссылка на стаические методы
        имя_класса :: имя _метода */
        String inStr = "Лямда выражения повышают эффективность Java";
        String outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);

        /*Ссылка на методы экземпляра
        ссылка на объект::имя метода*/
        MyStringOps strOps = new MyStringOps();
        outStr = stringOp2(strOps::strReverse2, inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);

    }
}
