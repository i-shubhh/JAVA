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
     System.out.println("Student is Eligible");

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
            System.out.println("Exception : " + e.getMessage());
          }
          finally
          {
            System.out.println("Final block Executed");
          }
        System.out.println("Program Completed");
    }
}