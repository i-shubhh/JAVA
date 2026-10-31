import java.io.*;

public class ShubhFileInput 
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream f1 = new FileInputStream("shubh.txt");
        
        int i ; 
        while ((i = f1.read()) != -1)
        {
            System.out.print(i);
        }
        f1.close();
    }    
}
