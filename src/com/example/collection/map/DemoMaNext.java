package com.example.collection.map;

import java.util.*;

public class DemoMaNext {
    private static Map<Integer,Accounts> accountsMap = new Hashtable<>();

    public static void addAcc(Accounts acc){
        accountsMap.put(acc.getIndex(),acc);
    }

    public static void update(Accounts acc){
        accountsMap.replace(acc.getIndex(),acc);
    };

    private  static Integer index = 0;

    public static Integer getIndex() {
        return index = index+1;
    }

    public static void main(String[] args) throws Exception {
        for (int i=0;i<3; i++) {
            Accounts accounts = new Accounts();
            accounts.setName("Alex" + i);
            accounts.setIndex(getIndex());
            addAcc(accounts);
        }
        Accounts acc = new Accounts();
        acc.setIndex(2);
        acc.setName("Lexx 100");
        update(acc);

        for ( Map.Entry<Integer, Accounts> accmap : accountsMap.entrySet()) {
            //  Map.Entry<Integer, String> next = myMap.higherEntry(e.getKey()+1); // next
            System.out.println(accmap.getKey()+" "+accmap.getValue().getIndex()+" "+accmap.getValue().getName());
        }
    }

    public static void change() {
        NavigableMap<Integer, String> myMap = new TreeMap<>();
        myMap.put(1,"s1");
        myMap.put(2,"s2");
        myMap.put(3,"s3");
        myMap.replace(2,"s10");

        for ( Map.Entry<Integer, String> e : myMap.entrySet()) {
            //  Map.Entry<Integer, String> next = myMap.higherEntry(e.getKey()+1); // next
            System.out.println(e.getKey()+" "+e.getValue());
        }
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