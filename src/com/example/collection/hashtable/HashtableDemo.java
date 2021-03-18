package com.example.collection.hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Kanat KB on 07.09.2017.
 */
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<String, Double>();
        Double bal;

        balance.put("Kim Su", 55.7);
        balance.put("Jon Snow", 87.2);
        balance.put("Bruce Li", 75.4);
        balance.put("Harry Potnyi", 10.1);

        //Получить ключи
        Set<String> set = balance.keySet();
        //Получить итератор
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next() + "; Sum = " + balance.get(itr.next()));
        }

        //Внести сумму
        bal = balance.get("Bruce Li");
        balance.put("Bruce Li", bal + 5);
        System.out.println("New account Bruce Li = " + balance.get("Bruce Li"));

    }
}
