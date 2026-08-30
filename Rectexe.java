class Rectangle
{
   int length;
   int breadth;

   void rectdisp()
   {
        double area = length * breadth;
        double perimeter = 2*(length * breadth);

        System.out.println("Area of Rectangle: " + area);   
        System.out.println("perimeter of Rectangle: " + perimeter);
    }
}
public class Rectexe
{
   public static void main(String[] args)
    {
       Rectangle r1 = new Rectangle();

       r1.length = 20;
       r1.breadth = 30;

      r1.rectdisp();


}
}