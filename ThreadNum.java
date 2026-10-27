class MyThread extends Thread 
{
    public void run()
    {
        for(int i = 1; i <= 10 ; i++)
        {
            System.out.println(i);
        }
    }
}

public class ThreadNum
{
    public static void main(String[] args) 
    {
        
    
    MyThread m1 = new MyThread();

    m1.start();
    }
}