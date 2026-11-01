class BankAccount
{
    int balance = 10000;
    
    void withdrawNonSynchronized(int amount)
    {
        if (balance >= amount)
        {
            System.out.println(Thread.currentThread().getName() + "Is Withdrawing" + amount);
            
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException ie)
            {
                System.out.println(ie);
            }
            
            balance = balance - amount;
            System.out.println("Remaining Balance " + balance);
        }
        else 
        {
            System.out.println(Thread.currentThread().getName() + "- Insufficiant Balance" );
        }
    }

    synchronized void withdrawSynchronized(int amount)
    {
        if (balance >= amount)
        {
            System.out.println(Thread.currentThread().getName() + "Is Withdrawing " + amount);

            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie);
            }
            balance = balance - amount;
            System.out.println("Remaining Balance" + balance);
        }
        else
        {
            System.out.println(Thread.currentThread().getName() + "- Insufficient Balance");
        }
    }
}

class MyThread extends Thread
{
    BankAccount account;
    int amount;
    boolean useSynchronization;

    MyThread(BankAccount account, int amount, boolean useSynchronization , String name)
    {
        super(name);
        this.account = account;
        this.amount = amount;
        this.useSynchronization = useSynchronization;
    }
    public void run()
    {
        if (useSynchronization)
        {
            account.withdrawSynchronized(amount);        
        }
        else
        {
            account.withdrawNonSynchronized(amount);
        }
    }
}

public class SynchronizedThread
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("\n----Non Synchronized Method----");

        BankAccount b1 = new BankAccount();

        MyThread t1 = new MyThread(b1, 700,false, "Thread 1");
        MyThread t2 = new MyThread(b1, 700, false, "Thread 2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance" + b1.balance);

         System.out.println("\n---- Synchronized Method----");

        BankAccount b2 = new BankAccount();

        MyThread t3 = new MyThread(b2, 700,false, "Thread 1");
        MyThread t4 = new MyThread(b2, 700, false, "Thread 2");

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("Final Balance" + b2.balance);

    }
}
