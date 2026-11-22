import java.sql.*;

public class InsertStudent
{
    public static void main(String[] args) 
    {
        try 
        {
            Connection con = DriverManager.getConnection("jdbc:sqlite:../college.db");

            String sql = "INSERT INTO Student (STUDENTID, NAME, DEPARTMENT, MARKS) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 104);
            ps.setString(2, "Shubham");
            ps.setString(3, "CSE");
            ps.setDouble(4, 85.5);

            int rows = ps.executeUpdate();
            if(rows > 0)
            {
                System.out.println("student Details Entered Successfully");
            }
           ps.close();
           con.close();
           }    
           catch(SQLException e)
           {
            System.out.println(e);
           }
    }
}
