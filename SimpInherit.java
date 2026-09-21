class Father 
{
    string name;
    int age;

    void fathdisp()
    {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
}

class son extends Father
{
    int rollno;
    String course ;
    
    void sondisp()
    {
        System.out.println("Roll no : " + rollno);
        System.out.println("course" + course);
    }
}

class SimpInherit
{
    public static void main(String[] args) {
        son s1 = new Son();

        s1.name = "Shubham";
        s1.age = 20 ;
        s1.rollno = 101;
        s1.course = " Cpmputer Science ";

        System.out.println("personal Details:");
        s1.fathdisp();

        System.out.println("sondisp")
        s1.sondisp();
    }

}