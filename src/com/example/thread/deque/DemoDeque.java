package com.example.thread.deque;

import java.util.*;

public class DemoDeque {
    public static void printDeque(Deque<?> d) {
        for (Object de : d)
            System.out.println("Print: "+de + ";");
    }

    public static void testDeque(){
        Deque<String> deque = new ArrayDeque<String>();
        deque.add(new String("Taraz"));
        deque.addFirst("Abraham");
        deque.addFirst("Queen");
        deque.addFirst("Moscow");
        deque.addLast("Karaganda");
        //deque.addLast(new Integer(5));//ошибка компиляции


        System.out.println("Before:");
        printDeque(deque);
        deque.pollFirst();
        //deque.poll();
        //System.out.println(deque.remove(2));

        System.out.println("After:");
        printDeque(deque);

        new Thread(()->{
            while(deque.peek() != null) {
                System.out.println("DEQUE1: " + deque.peek());
                System.out.println("DEQUE2: " + deque.pop());
            }
        }).run();
    }

    public static void main(String[] args) {
        Deque<Accounts> deque = new ArrayDeque<>();
        for (int i=0;i<5;i++) {
            Accounts accounts = new Accounts();
            accounts.setIndex(i);
            accounts.setName("Adroid="+i);
            deque.add(accounts);
        }

        List<Accounts> accounts = new ArrayList<>();

        while(deque.peek() != null){
            if ( deque.peek().getIndex() == 3) { deque.peek().setName("Samsung J7");}
            accounts.add(deque.peek());
            System.out.println("name: "+deque.pop().getName());
        }

        System.out.println("---------Before change--------");
        accounts.forEach(acc->{
            System.out.println("LIST: "+acc.getIndex()+" : "+acc.getName());
        });


    }
}

class Accounts {

    private Integer index;
    private String name;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }
}

