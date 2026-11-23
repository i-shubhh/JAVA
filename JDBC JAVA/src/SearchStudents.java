import java.sql.*;

public class SearchStudents
{
    public static void main(String[] args) 
    {
     
        try 
        {
            Class.forName("org.sqlite.JDBC");

            Connection con = DriverManager.getConnection("jdbc:sqlite:../college.db");

            System.out.println("Database Connected Successfullly");

            int id = 101;

            String query = "SELECT * FROM Student WHERE StudentID = ?";

            PreparedStatement pst  = con.prepareStatement(query);

            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next())
            {
                System.out.println("\n Student Found ");
                System.out.println("StudentID " + rs.getInt("StudentID"));
                System.out.println("Name" + rs.getString("Name"));
                System.out.println("Department" + rs.getString("Department"));
                System.out.println("Marks" + rs.getInt("Marks"));
            }
            else{
                System.out.println("Student Not Found");
            }
            rs.close();
            con.close();
            pst.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}