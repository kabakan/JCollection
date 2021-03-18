package com.example.thread;

public class SingletonDemo {
  public static void main(String[] args) throws InterruptedException {
    final int SIZE = 2;
    Thread t[] = new Thread[SIZE];

    for(int i=0; i<SIZE; i++){
      t[i] = new Thread(new R());
      t[i].start();
    }

    for(int i=0; i<SIZE; i++){
      t[i].join();
    }
    //Singleton.setInstance(null);
    System.out.println(Singleton.counter);

  }

}

class R implements Runnable{
  @Override
  public void run() {
    Singleton.getInstance();
    Singleton.setInstance(null);
  }
}

class Singleton {
   public static int counter =0;
   private static volatile  Singleton instance = null;

   private Singleton(){
     counter++;
   }

   public  static  Singleton getInstance(){
     if(instance == null) {
       synchronized (Singleton.class){
         if(instance== null)
           instance = new Singleton();
       }
     }
     return instance;
   }

  public static void setInstance(Singleton ins){
     instance = ins;
  }
}