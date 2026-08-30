import java.util.Scanner;
public class Calculator {
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter First Number: ");
    double a = sc.nextDouble();

    System.out.println("Enter operators (+,-,*,/) : ");
    char operator = sc.next().charAt(0);

    System.out.println("Enter Second number : ");
    double b = sc.nextDouble();

    double result;

    switch (operator)  {
        case '+':
            result = a + b;
            System.out.println("Result = " + result);
            break;

        case '-':
            result = a - b;
            System.out.println("Result=" + result);
            break;
        
        case '*':
            result = a * b;
            System.out.println("Result=" + result);
            break;

        case '/':
            if(b != 0) {
            result = a / b;
            System.out.println("Result=" + result);
    }
    else
         {
        System.out.println("Cannot Divide by Zero.");
    }
    break;

  default:
    System.out.println("Invalid operator"); 
}
sc.close(); 
   } 
}
