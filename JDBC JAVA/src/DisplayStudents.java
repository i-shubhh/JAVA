import java.sql.*;

public class DisplayStudents
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("org.sqlite.JDBC");

            Connection con = DriverManager.getConnection("jdbc:sqlite:../college.db");

            String sql = "SELECT * FROM Student";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Student Records:");
            System.out.println("-----------------------------------");

            while(rs.next())
            {
                System.out.println("StudentID: " + rs.getInt("STUDENTID"));
                System.out.println("Name: " + rs.getString("NAME"));
                System.out.println("Department: " + rs.getString("DEPARTMENT"));
                System.out.println("Marks: " + rs.getDouble("MARKS"));

                System.out.println("-----------------------------------");
            }

            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}