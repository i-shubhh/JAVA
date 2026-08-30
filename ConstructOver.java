class Box
{
    int length;
    int breadth;
    int height;

    Box ()
    {
        length = 1 ;
        breadth = 1;
        height = 1;
    }

    Box (int side) 
    {
        length = side;
        breadth = side;
        height = side;
    }

    Box (int l, int b, int h )
    {
        length = l;
        breadth = b;
        height = h;
    }

    int volume()
    {
        return length * breadth * height;
    }
}
public class ConstructOver
{
   public static void main(String[] args) {
       Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(4,5,6);

        System.out.println("Volume of Box 1: " + b1.volume());
        System.out.println("Volume of Box 2: " + b2.volume());
        System.out.println("Volume of Box 3: " + b3.volume());

   }
}