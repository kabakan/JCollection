package com.example.Concurrency.concur.kit;

/* ATTN: Deadlock might not occurr since it's random. In this case, simply
 * re-run the class until there's a deadlock.
 * Now, how this deadlock can be fixed?
 */
class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    synchronized 
    void withdraw(int amount) {
        balance -= amount;
    }

    synchronized 
    void deposit(int amount) {
        balance += amount;
    }

// Comment the 'synchronized' keyword out to remove exessive synchronization
// and escape from the deadly embrace
    synchronized 
    void transfer(Account acc, int amount) {
        deposit(amount);
        acc.withdraw(amount);
    }
}

public class G8_07_DeadlyEmbrace {

    static Account acc1 = new Account(100);
    static Account acc2 = new Account(100);

    public static void main(String[] args) throws InterruptedException{

        Runnable r1 = () -> {
            for (int i = 0; i < 1000; i++) {
                acc1.transfer(acc2, 10);
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 1000; i++) {
                acc2.transfer(acc1, 10);
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        System.out.println("Starting threads");
        t1.start();
        t2.start();

        System.out.println("Waiting for threads to finish");
        t1.join();
        t2.join();

        System.out.println("Acc1 balance: " + acc1.balance);
        System.out.println("Acc2 balance: " + acc2.balance);
    }

}
