package com.example.Concurrency.concur.demo;

class SnowMaiden extends Thread{
    final Santa santa;

    public SnowMaiden(Santa santa) {
        this.santa = santa;
    }
    @Override
    public void run(){
        System.out.println("SnowMaiden: Is Santa here? Children: " + santa.arrived);
        synchronized(santa) {
            try{
                santa.wait();
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
        System.out.println("SnowMaiden + Children: Finally!!!");
        
    }
}

class Santa  extends Thread{
    boolean arrived = false;
    @Override
    public void run(){
        while(!arrived){
            try{
                Thread.sleep(3000);
            }catch(InterruptedException ie){
                    System.out.println(ie);
            }

//            java.util.Scanner sc = new java.util.Scanner(System.in);
//            System.out.print("Santa: ");
//            sc.nextLine();

            announce();
        }
    }
    synchronized void announce(){
        arrived = true;
        notify();
    }
}


public class HappyNewYear {
    public static void main(String[] args) {
        Santa santa = new Santa();
        SnowMaiden sm = new SnowMaiden(santa);
        sm.start();
        santa.start();
    }
}
