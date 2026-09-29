class Mythread extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("My Thread is Running " + i);
            
        try 
        {
            Thread.sleep(1000);
        } 
        catch (InterruptedException ie)
        {
            System.out.println(ie);
        }
        }
    }
}

public class ThreadExam
{
    public static void main(String[] args) 
    {
        Mythread m1 = new Mythread();
        
            m1.start();
            System.out.println("MY THREAD IS RUNNING");

        
    }
}