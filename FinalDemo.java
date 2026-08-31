class Student
{
    final int rollno;
    Student(int r)
    {
        rollno = r;
    }

    void studisp()
    {
        System.out.println("Roll No is : " + rollno);
    }
}

public class FinalDemo
{
  public static void main(String[] args) {
      Student s1 = new Student(52);

      s1.studisp();
  }
}