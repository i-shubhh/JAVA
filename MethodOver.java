class Area
{
    int area(int s){
        return  s*s;
    }
    int area(int l, int b)
    {
       return l*b;
    }
    double area(double  r)
    {
        return 3.14 * r * r;
    }
}
public class MethodOver
{
public static void main(String[] args) {
    Area a1 = new Area();

    System.out.println("AREA OF SQUARE: " + a1.area(7));
    System.out.println("AREA OF RECTANGLE: " + a1.area(7, 8));
    System.out.println("AREA OF CIRCLE: " + a1.area(4.5));
}
}
