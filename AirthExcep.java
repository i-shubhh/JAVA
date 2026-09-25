class AirthExcep
{
    public static void main(String[] args) 
    {
        int a = 20;
        int b = 0;
        
        try 
        {
        int result = a/b;
        System.err.println("result : " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception : cannot divide by zero");
        }
        System.out.println("promgram Completed");
        
    }
}