class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException(String message)
    {
        super(message);
    }
}

class ExcepBank
{
    public static void main(String[] args)
    {
        double balance = 5000;
        double withdrawal = 7000;

        try
        {
            if (withdrawal > balance)
            {
                throw new InsufficientBalanceException(
                    "Insufficient balance!"
                );
            }

            balance = balance - withdrawal;

            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
    }
}