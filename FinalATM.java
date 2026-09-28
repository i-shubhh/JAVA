class ATM
{
    void withdraw(int amount)
    {
        try
        {
            if (amount <= 0)
            {
                throw new Exception ("Invalid Withdrawl Amount");
            }
            System.out.println("Withdrawl Successfull");
            System.out.println("amount Withdrawl" + + amount);
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally 
        {
            System.out.println("Please collect your card ");
        }
    }
}

public class FinalATM
{
    public static void main(String[] args)
    {
    ATM a1 = new ATM();
    a1.withdraw(0);
    }
}