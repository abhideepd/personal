package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class matrix_1 
{
    static int arr[][];
    static int row;
    static int col;
    public static void main(String args[])throws IOException
    {
        input(args);
    }
    static void input(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());

        for(int i=0; i<t; i++)
        {
            String dimention[]=(x.readLine()).split(" ");
            row=Integer.parseInt(dimention[0]);
            col=Integer.parseInt(dimention[1]);
            arr=new int[row][col];
        }
    }
}
