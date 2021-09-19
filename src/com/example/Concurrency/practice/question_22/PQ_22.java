package com.example.Concurrency.practice.question_22;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
    Practice Question 22
 */

class GirlFriend implements Callable<String> {

    String str;

    public GirlFriend(String str) {
        this.str = str;
    }

    public String call() throws Exception {
        return str.concat(" Call her!");
    }
}

//class GirlFriend implements Runnable {
//
//    String str;
//
//    public GirlFriend(String str) {
//        this.str = str;
//    }
//
//    public void run()  {
////        return str.concat(" Call her!");
//    }
//}

public class PQ_22 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService exec = Executors.newFixedThreadPool(3); // line n1
        Future fut = exec.submit(new GirlFriend("Call her!"));
        String str = fut.get().toString();
        System.out.println(str);
    }
}
