package com.example.Concurrency.forkjoin;
import java.util.*;
public class Recursion_1_TopDown_BottomUp {

    static Deque<Integer> q = new LinkedList<>();
    
    static void enqueue(int task, int tr)throws InterruptedException{
//--- bottom-up
        while(true){
            if (task <= 0) return;
            if (task < tr) { q.push(task % tr); return;}
            if (task == tr) { q.push(task); return;}
            q.push(tr);
            task -= tr;
        }

//--- top-down
//        if (task <= 0) return;
//        if (task < tr) { q.add(task % tr); return;}
//        if (task == tr) { q.add(task); return;}
//        if (task > tr){
//            q.add(tr);
//            Thread.sleep(250);
//            enqueue(task - tr, tr);
//        }
    }
    
    public static void main(String[] args) throws InterruptedException{

        enqueue(1234564, 3);
        System.out.println("Final queue: " + q);
        
    }
}
