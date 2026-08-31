class Calc
{
    static void calculate(int n)
    {
        System.out.println("Square = " + n*n);
        System.out.println("Cube = " + n*n*n) ;
    }
}

public class StaticDemo
{
     public static void main(String[] args) {
         
        Calc.calculate(5);
        
     }
}