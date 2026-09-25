class Calculate
{
    int calculate(int n)
    {
        return n * n;
    }

    int calculate(int n, int dummy)
    {
        return n * n * n;
    }

    double calculate(double n)
    {
        return n *n ;
    }
}
public class PolyCube
{
    public static void main(String[] args)
    {
        Calculate obj  = new Calculate();
        {
           System.out.println("Square Of Integer :" + obj.calculate(4));
            System.out.println("cube Of Integer :" + obj.calculate(3, 1));
            System.out.println("Square Of Double :" + obj.calculate(34.5));

        }
    }
}