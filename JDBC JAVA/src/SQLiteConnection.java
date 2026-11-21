import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection 
{
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("org.sqlite.JDBC");

            Connection con = DriverManager.getConnection("jdbc:sqlite:college.db");
            System.out.println("Connection Estabilised SuccessFully");
            con.close();
        } 
        catch(ClassNotFoundException e)
        {
            System.out.println("SQLite JDBC Driver NOt Found");
        }
        catch(SQLException e)
        {
            System.out.println("Database Connection Failed");
            e.printStackTrace();
        }

    }
}
