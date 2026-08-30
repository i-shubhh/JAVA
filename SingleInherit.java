class Father
{
void fatherdisp()
{
System.out.println("i am from Father class");
}
}

class son extends Father
{
void sondisp()
{
System.out.println("i am from son clsss");
}
}

public class SingleInherit
{
public static void main( String args[]){
son s1 = new son();

s1.sondisp();
s1.fatherdisp();
}
}