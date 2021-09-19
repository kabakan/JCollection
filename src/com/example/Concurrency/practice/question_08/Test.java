package com.example.Concurrency.practice.question_08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/*
    Practice Question 08
 */
class Test implements Runnable {

    String fileName;

    public Test(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println(fileName);
    }

    public static void main(String[] args) throws IOException, InterruptedException  {

        ExecutorService exec = Executors.newCachedThreadPool();
//        ExecutorService exec = Executors.newFixedThreadPool(1);
        Stream<Path> listOfFiles = Files.walk(Paths.get("C:\\Try_Java"));
//        Stream<Path> listOfFiles = Files.walk(Paths.get("C:\\Program Files"));

        listOfFiles.forEach(e -> {
            exec.execute(new Test(e.getFileName().toString()));   // line n1
        });

        exec.shutdown();

        exec.awaitTermination(365, TimeUnit.DAYS);                // line n2
    }
}

















/*
    Where is the abstract execute(Runnable command) method declared?

        A. In the Executor interface
        B. In the Runnable Interface
        C. In the Thread class
*/
