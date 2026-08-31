class Student
{
    String name;
    int rollno;

    Student(String name, int rollno)
    {
        this.name = name;
        this.rollno = rollno;
        System.out.println("Parameterized Constructor Called");
    }

    Student()
    {
        this("Shubham", 454);
        System.out.println("Default Constructor Called");
    }
    void studisp()
    {
        System.out.println("Name is : " + name);
        System.out.println("Roll No is : " + rollno) ;
    }
}

public class ConstCalling
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();

        s1.studisp();
    }

}