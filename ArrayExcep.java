class ArrayExcep
{
    public static void main(String[] args) 
    {
        int arr[] = {10,20,30,40,50,60};

        try 
        {
        System.out.println("Element ; " + arr[10]);    
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception : Array out of bound");
         }
             System.out.println("program completed");
        }
}