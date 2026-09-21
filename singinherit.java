class Employee 
{
    String name;
    int id;

    void empdisp()
    {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id ) ;    
    }
}

class Manager extends Employee
{
   String department;

   void mandisp()
   {
    System.out.println("Department : " + department);
   }
}

public class singinherit
{
    public static void main(String[] args) {
        Manager m1 = new Manager();

        m1.name = "Shubham";
        m1.id = 454;
        m1.department = "CSEAIML";

        m1.empdisp();
        m1.mandisp();
    }
}