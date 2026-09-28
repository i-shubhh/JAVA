class Age
{
    void checkage(int age) throws Exception
    {
        if ( age < 18)
        {
            throw new Exception ("You must be 18 or older");
        }
        System.out.println("You are eligible");
    }
}

public class ThrowExcep
{
    public static void main(String[] args)
    {
        Age  a1 = new Age();
         
        try 
        {
            a1.checkage(16);
        } 
        catch (Exception e) 
        {
            System.out.println("Exception :" + e.getMessage());
        }
        System.out.println("Program Completed");
    }
}