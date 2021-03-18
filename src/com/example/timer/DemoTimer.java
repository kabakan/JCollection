package com.example.timer;
import java.util.*;

public class DemoTimer {
  public static void main(String args[]) {
    Timer timer = new Timer();
    timer.schedule(new SayHello(), 0, 4000); // ставим по расписанию выполнять SayHello каждые 4 секунды
  }
}

class SayHello extends TimerTask {
  public void run() {
    System.out.println("Hi!");
  }
}