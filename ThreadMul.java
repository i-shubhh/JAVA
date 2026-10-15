class Mythread extends Thread
{
    public void run()

    {
        System.out.println("My Thread is Running ");
    }
}
public class ThreadMul
{
    public static void main(String[] args) 
    {
        Mythread t1 = new Mythread();

        System.out.println("Name of This Thread is :" + t1.isAlive() );

        t1.start();
    }
}