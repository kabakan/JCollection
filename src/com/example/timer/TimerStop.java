package com.example.timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerStop {
  public static void main(String args[]) {
    Timer t = new Timer();
    t.schedule(new TimerTask() {
      @Override
      public void run() {
        System.out.println(" Run spcific task at given time.");
        t.cancel();
      }
    }, 10000);
  }
}


