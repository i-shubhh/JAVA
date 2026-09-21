class Student 
{
    String name;
    int rollno;

    void studisp()
    {
        name = "shubham jha";
        rollno = 745;
    }
    void namedisp()
    {
        System.out.println("Name of Student :" + name);
        System.out.println("Roll No : " + rollno );
    }

}
class Exam extends Student
{
int mark1,mark2,mark3;
    
     void examdisp()
     {
        mark1 = 324;
        mark2 = 234;
        mark3 = 654;
    }
    void markdisp()
    {
        System.out.println("Marks in Subject 1 : " + mark1);
        System.out.println("Marks in Subject 2 : " + mark2);
        System.out.println("Marks in Subject 3 : " + mark3);
    }
}
class Result extends Exam
{
    int total;
     void resultdisp()
     {
          total = mark1 + mark2 + mark3;
     }
     void totaldisp()
     {
        System.out.println("Total Marks : " + total);
     }
}
public class ExamHira
{
    public static void main(String arg[])
    { 
        Result r = new Result();

        r.studisp();
        r.namedisp();
        r.examdisp();
        r.markdisp();
        r.resultdisp();
        r.totaldisp();
    }
}