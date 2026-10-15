class MulExcep
{
    static void method3() throws InterruptedException

    {

        Thread.sleep(1000);

        System.out.println("Inside Method 3");

    }

    static void method2() throws InterruptedException

    {

        method3();

        System.out.println("Inside Method 2");

    }

    static void method1() throws InterruptedException

    {

        method2();

        System.out.println("Inside Method 1");

    }

    public static void main(String[] args)

    {

        try

        {

            method1();

        }

        catch (InterruptedException e)

        {

            System.out.println("Exception handled in main");

        }

        System.out.println("Program continues...");

    }

}