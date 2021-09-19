package com.example.Concurrency.practice.question_06;

/*
    Practice Question 06
*/

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Caller implements Callable<String> {

    String str;

    public Caller(String str) {
        this.str = str;
    }

    public String call() throws Exception {
        return str.concat("Caller");
    }
}

class Runner implements Runnable {

    String str;

    public Runner(String str) {
        this.str = str;
    }

    public void run() {
        System.out.println(str.concat("Runner"));
    }
}

public class PQ_06 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        Future f1 = exec.submit(new Caller("Call "));
        Future f2 = exec.submit(new Runner("Run "));
        String str1 = (String) f1.get();
        String str2 = (String) f2.get();                 //line n1
        System.out.println(str1 + " : " + str2);
    }
}
