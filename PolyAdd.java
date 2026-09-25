class Addition 
{
    int add(int a,int b)
    {
        return a + b ;
    }

    int add(int a , int b , int c )
    {
        return a + b + c;
    }

    double add( double a , double b)
    {
        return a + b ;
    }
}

public class PolyAdd
{
    public static void main(String[] args)
     {
        Addition obj = new Addition();

        System.out.println("Sum of 2  Integers : " + obj.add(20, 30));
         System.out.println("Sum of 3  Integers : " + obj.add(20, 30, 59));
          System.out.println("Sum of 2  Double values : " + obj.add(30.43, 32.43));
    }

}