class Student
{
    String name;
    int rollno;


Student( String name, int rollno)
{
    this.name = name;
    this.rollno = rollno;
}

void studisp() {
    System.out.println("Name is :" + name );
    System.out.println("RollNo is : " + rollno);
}
}
public class ThisStudent
{
    public static void main(String[] args) {
        Student s1 = new Student("Shbham jha", 345);

        s1.studisp();
    }

}