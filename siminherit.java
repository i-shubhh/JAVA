

class person 
{
    String name;
    int age;

    void perdisp()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);          
    }
}

class Student extends person
{
   String Course;
   int rollno;

   void Studisp()
   {
    System.out.println("Course : " + Course);
    System.out.println("Roll No : " + rollno );

   }
}

public class siminherit
{
    public static void main(String args[])
    {
        Student s1 = new Student();

        s1.name = "Shubham";
        s1.age = 20;
        s1.rollno = 32;
        s1.Course = "CSE AIML";

        s1.perdisp();
        s1.Studisp();

          
    }

}