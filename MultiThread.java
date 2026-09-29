class MyThread extends Thread   
{
    public void run()
    {
        for (int i = 0 ; i < 9 ; i++)
        {
            System.out.println("MY THREAD IS RUNNING " + i );

            try
            {
                Thread.sleep(500);
            }

            catch (InterruptedException ie)
            {
                System.out.println(ie);
            }
        }
    }
}
class YourThread extends Thread
{
    public void run()
    {
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("YOUR THREAD iS RUNNING " + i);

            try 
            {
                Thread.sleep (500);
            }    

            catch (InterruptedException ie)
            {
                System.out.println(ie);
            }
                
            
        }
    }
}
public class MultiThread
{
    public static void main(String[] args) 
    {
    MyThread m1 = new MyThread();
    YourThread y1 = new YourThread();

    m1.start();
    y1.start();

    }
}