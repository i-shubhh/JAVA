class Bank
{
    private double balance;

    Bank(double balance)
    {
        this.balance = balance;
    }
    void withdraw (double amount) throws Exception
    {
        if (amount > balance)
        {
            throw new Exception ("Insufficient Balance");
        }
        balance = balance - amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining balance: " + balance);
    }
}
public class BankExcep
{
    public static void main(String[] args) 
    {
        Bank b1 = new Bank(5000);
        try
        {
            b1.withdraw(6000);
        }
        catch(Exception e)
        {
            System.out.println("Transaction Failed :" + e.getMessage());
        }
        System.out.println("Program completed");
    }
}