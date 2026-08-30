interface Balancecheck
{
    default void balancedisp()
    {
        System.out.println("balance is: 50000");
    }
}

interface  MoneyWithdrawl
{
    default void withdrawldisp()
    {
        System.out.println("Money withdrawl : 500");
    }

}

interface  MoneyDeposit
{
   default void depositdisp()
    {
        System.out.println(" Money Deposited: 1500");
    }
}

interface ChangePin
{
   default void pindisp()
    {
        System.out.println("Pin ia : 4241");
    }   
}

class Acoount implements Balancecheck , MoneyWithdrawl , MoneyDeposit , ChangePin
{
   void accountdisp()
    {
        System.out.println("Account name : Shubham Jha");
    }
}

public class Bank
{
 public static void main(String[] args) {
     Acoount a1 = new Acoount();

     a1.accountdisp();
     a1.balancedisp();
     a1.withdrawldisp();
     a1.depositdisp();
     a1.pindisp();



 }
}