class Student 
{
    String name;
    int rollno;

    static String college = "SRM UNIVERSITY";

    Student(String n , int r)
    {
       name = n;
       rollno = r;
    }

    void studisp()
    {
        System.out.println("Name is :" + name);
        System.out.println("Roll No is : " + rollno);
        System.out.println("College is : " + college);

    }
}

public class StaticCollege
{
    public static void main(String[] args) {
        
    
      Student s1 = new Student("Shubham Jha", 44);
      Student s2 = new Student("Ravi", 22);
      Student s3 = new Student("Basha Sir", 74);

      s1.studisp();
      s2.studisp();
      s3.studisp();

    }
}