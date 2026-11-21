import java.sql.*;

public class StudentTable
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        try 
        {
            Class.forName("org.sqlite.JDBC");

            Connection con = DriverManager.getConnection("jdbc:sqlite:college.db");

            System.out.println("DataBase Connected Successfully");
            Statement stmt = con.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS Student (" +
                         "STUDENTID INTEGER PRIMARY KEY, " + 
                         "NAME TEXT, " +
                         "DEPARTMENT TEXT, " +
                         "MARKS REAL)";     
            
            stmt.executeUpdate(sql);
            System.out.println("Student Table Created Successfully");

            stmt.close();
            con.close();
         }    

         catch(Exception e)
         {
            System.out.println(e);
         }
    }
}