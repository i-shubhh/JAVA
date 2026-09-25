class Student 
{
  int age ;

  Student ( int age) {
    this.age = age;
  }

  void checkage () throws Exception
  {
     if  (age < 18 ) 
     {
      throw new Exception("Student is not Eligible");
     }
     System.err.println("Student is Eligible");

  }
}
class Excep
{
    public static void main(String[] args)
    {
        Student s1 = new Student(16);
        
          try
          {
            s1.checkage();
          }
          catch (Exception e )
          {
            System.err.println("Exception : " + e.getMessage());
          }
          finally
          {
            System.err.println("Final block Executed");
          }
        System.err.println("Program Completed");
    }
}