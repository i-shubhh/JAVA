class MyThread extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + "is running with Priority" + Thread.currentThread().getPriority());

    }
}

public class Priority
{
    public static void main(String[] args) 
    {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("thread 3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Thread 1 Priority : " + t1.getPriority());
        System.out.println("Thread 2 Priority : " + t2.getPriority());
        System.out.println("Thread 3 Priority : " + t3.getPriority());
        
        t1.start();
        t2.start();
        t3.start();
    }
}