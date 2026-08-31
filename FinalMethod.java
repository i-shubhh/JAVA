class Father
{
    final void fathdisp()
    {
        System.out.println("THIS IS FATHER CLASS");
    }
}

class Child extends Father
{
   /* void disp()
    {
        System.out.println("THIS IS CHILD DISPLAY");
    }
     */
}

public class FinalMethod
{
public static void main(String[] args) {
    Child c1 = new Child();

    c1.fathdisp();
    
}
}