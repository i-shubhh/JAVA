class Employee
{
    int empid;
    String name;
    double salary; 

void empdisp()
{
 System.out.println("Employee ID : " + empid);
 System.out.println("Employee Name: " + name);
 System.out.println("Employee Salary: " + salary);
}
}

public class Empexe
{
public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.empid = 07;
    e1.name = "Shubham";
    e1.salary = 75000;

    Employee e2 = new Employee();
    e2.empid = 04;
    e2.name = "Ravi";
    e2.salary = 5000;

    e1.empdisp();
    e2.empdisp();
}
}
