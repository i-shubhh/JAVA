class Student
{
    String name;
    int rollno;

    Student()
    {
        name = "";
        rollno= 0 ;
    }

    Student(String n) 
    {
        name = n ;
        rollno = 0;
    }

    Student (String n, int r)
    {
        name = n;
        rollno = r;
    }
    void studisp()
    {
        System.out.println("Name: " + name );
        System.out.println("RollNo: " + rollno);
        System.out.println();
    }



}
public class ConOver
{
public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("Shubham");
    Student s3 = new Student("Ravi ", 362);

    s1.studisp();
    s2.studisp();
    s3.studisp();
    
}
}