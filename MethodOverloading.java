class calcl
{
   int add( int a , int b)
   {
    return a+b;
   }
   int add ( int a , int b , int c)
    {
        return a+b+c;
    }
    double add ( double  a , double b)
    {
        return a+b;
    }
   
}
public class MethodOverloading
{
public static void main(String[] args) {
    calcl c1 = new calcl();

    System.out.println("SUM OF TWO INTEGERS IS: " + c1.add(10,20));

    System.out.println("SUM OF THREE INTEGERS IS: " + c1.add(10,20, 30));

    System.out.println("SUM OF TWO DOUBLE VALUES IS: " + c1.add(10.6,20.3));

}
}