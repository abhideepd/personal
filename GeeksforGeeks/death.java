package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class death {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int n=Integer.parseInt(input[0]);
            int k=Integer.parseInt(input[1]);
            ArrayList<Integer> arr=new ArrayList<Integer>();
            for(int i=0; i<n; i++)
            arr.add(i+1);   
        }
    } 
}
