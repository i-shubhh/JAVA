class Display
{
   void display ( int a)
   {
      System.out.println("Integer : " + a);
   }
    void display( String s)
    {
        System.out.println("String : " + s);
    }

    void display(int a , String s)
    {
        System.out.println("Integer : " + a + " , String : " + s);
    }
}
public class PolyDisp
{
    public static void main(String[] args)
    {
        Display obj = new Display();
        
        obj.display(30 );
        obj.display("shubham");
        obj.display( 10  , "ravi");

    }
}