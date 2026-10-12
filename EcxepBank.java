class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException ( String message)
    {
        super(message);
    }
}

class Main
{
    public static void main(String[] args) 
    {
        double balance = 7000;
        double withdrawal = 9000;
    
    
    try 
    {
        if (balance < withdrawal)
        {
            throw new InsufficientBalanceException(" Insufficient Balance cannot Withdraw money");
        }
    

        balance = balance - withdrawal;
        System.out.println("Withdrawl Successfull");
        System.out.println("Remaining Balance " + balance);
    }

        catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continuess....");
    }
}

    
    

    
