class MyThread1 extends Thread
{
   public void run()
   {
        for (int i = 1 ; i <= 5 ; i++ )
        {
            System.out.println("MY THREAD 1 IS RUNNING" + i );
        }
   }
}

class MyThread2 extends Thread
{
    public void run()
    {
        for (int i = 1 ; i <= 5 ; i++ )
        {
            System.out.println("MY THREAD 2 IS RUNNING" + i);
        }
    }
}

class UserdifThread 
{
    public static void main(String[] args) 
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }

}