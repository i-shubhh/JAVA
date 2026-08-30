import java.util.Scanner;

public class Season {
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the month number (1-12): ");
    int month = sc.nextInt();

    if (month == 12 || month == 1 || month == 2){
        System.out.println("Season is Winter");
    }
    else if (month == 3 || month ==4 || month == 5){
        System.out.println( "Season is Spring");
    }
    else if (month == 6 || month == 7 || month == 8){
        System.out.println("Season is Summer");
    }
    else if (month == 9 || month == 10 || month == 11){
        System.out.println("Season is Autumn");
    }
    else {
        System.out.println("Invalid month number");

    }
    sc.close();
   
    }


}
