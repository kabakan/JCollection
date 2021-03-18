package com.example.thread.synchronizing;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StaticSynList {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++) {
            System.out.println("ClientsList.getIndex() ="+ClientsList.getIndex());
        }
        try {
            Clients clients = new Clients();
            clients.setId(ClientsList.getIndex());
            clients.setName("Arzu");
            clients.setCode("A1");
            ClientsList.addClients(clients);

            Clients clients1 = new Clients();
            clients1.setId(ClientsList.getIndex());
            clients1.setName("Taraz");
            clients1.setCode("T1");
            ClientsList.addClients(clients1);

            ClientsList.print();
        } catch (Exception ex) {
            System.out.println("Err: "+ex.getMessage());
        }
    }

    public static void addClientThread(Clients clients){
       // MyThread myThread = new MyThread(clients);
        //myThread.setClients(clients);
      //  myThread.start();
        for (int i=0;i<=10;i++) {
            new Thread(() -> {
                ClientsList.addClients(clients);
            }
            ).start();
            System.out.println("i = "+i);
        }
    }
}

class ClientsList {
    private static List<Clients> clientsList = new ArrayList<Clients>();
    public static int index = 0;

    public static Integer getIndex() {
        return index = index+1;
    }

    public static void addClients(Clients clients) {
        clientsList.add(clients);
    }
    public static List<Clients> getClientsList() {
      return clientsList;
    }

    public static void print(){
          for (Clients cli : getClientsList()) {
            System.out.println(cli.getId()+" = "+cli.getName() + " : " + cli.getCode());
          }
    }

}

class Clients {
    private Integer id;
    private String name;
    private String code;

    public Integer getId() { return id; }
    public void setId(Integer id) {this.id = id; }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}


class MyThread extends Thread {
    private ClientsList clientsList;
    public static Clients clients = new Clients();

    public Clients getClients() {
        return clients;
    }

    public MyThread(Clients clients) throws InterruptedException {
        this.clients = clients;
        sleep(1000);
    }
   /* public void setClients(Clients clients) {
        this.clients = clients;
    }
    */

    @Override
    public void run() {
        ClientsList.addClients(getClients());
    }
}