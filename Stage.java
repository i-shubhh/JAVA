import java.lang.Thread.State;

class MyThread extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e )
        {
            System.out.println(e);
        }
    }
}

public class Stage 
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread t1 = new MyThread();

        System.out.println("State :" + t1.getState());

        t1.start();
        System.out.println("State :" + t1.getState());

        Thread.sleep(100);
        System.out.println("State :" + t1.getState());

        t1.join();
        System.out.println("State :" + t1.getState());

    }
}