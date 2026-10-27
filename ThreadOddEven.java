class EvenThraed extends Thread
{
    public void run()
    {
        for (int i=2 ; i<=20 ; i+= 2  )
        {
            System.out.println(i);
        }
    }
}

class OddThread extends Thread
{
    public void run()
    {
        for ( int i = 1 ; i <= 19 ; i+= 2)
        {
            System.out.println(i);
        }
    }
}

public class ThreadOddEven 
{
    public static void main(String[] args) 
    {
        EvenThraed t1 = new EvenThraed();
        OddThread t2 = new OddThread();

        t1.start();
        t2.start();

    }
}