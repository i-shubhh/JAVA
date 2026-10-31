import java.io.*;
class ShubhInputStream
{
    public static void main(String[] args) throws IOException
    {
        InputStream sh = System.in;

        System.out.print("Enter a Character : " );

        int x = sh.read();
        System.out.print("Data : " +  x);
     }
