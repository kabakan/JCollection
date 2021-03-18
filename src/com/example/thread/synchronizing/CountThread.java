package com.example.thread.synchronizing;

class CountThread implements Runnable{

  CommonResource res;
  CountThread(CommonResource res){
    this.res=res;
  }
  public void run(){
    synchronized(res){
      res.x=1;
      for (int i = 1; i < 5; i++){
        System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
        res.x++;
        try{
          Thread.sleep(100);
        }
        catch(InterruptedException e){}
      }
    }
  }
}

class CommonResource{

  int x=0;
}

class Print {
  public static void main (String[] args) {
     CommonResource res = new CommonResource();

    for (int i = 1; i < 6; i++){

      Thread t = new Thread(new CountThread(res));
      t.setName("Thread "+ i);
      t.start();
    }

  }
}