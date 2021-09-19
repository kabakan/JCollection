package com.ocp_8.chapter07Concurrency;

/**
 * Created by Kanat KB on 12.10.2017.
 * 19. What statements about the following class definition are true? (Choose all that apply.)
 * <p>
 * A. It compiles without issue.
 * B. The code will not compile because of line k2.
 * C. The code will not compile because of line k3.
 * D. The lock locks acquired on k1 and k4 are on the same object.
 * E. The class correctly prevents concurrency issues for the value of tickets when accessed
 * by multiple threads.
 * F. At most one instance of TicketManager will be created in the application.
 */
public class Test19 {
}

class TicketManager {
    /*
    private TicketManager() { super(); }

    private static TicketManager instance;

    public static synchronized TicketManager getInstance() { // k1
        if (instance == null) instance = new TicketManager(); // k2
        return instance;
    }
    private int tickets;

    public static int getTicketCount() { return tickets; }

    public static void makeTicketsAvailable(int value) { tickets += value; } // k3

    public static void sellTickets(int value) {
        synchronized (this) { // k4
            tickets -= value;
        }
    }

    public static void main(String[] args) {
        getTicketCount();
        makeTicketsAvailable(1);
    }
    */
}