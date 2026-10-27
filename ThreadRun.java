class MyThread implements Runnable
{
    public void run()
    {
        for (int i = 1; i<= 10; i++)
        {
            System.out.println(i);
        }
    }
}

public class ThreadRun
{
    public static void main(String[] args) 
    {
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        t.start();

    }
}