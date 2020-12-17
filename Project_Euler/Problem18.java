package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem18 
{
    static ArrayList<ArrayList<Long>> arr=new ArrayList<ArrayList<Long>>();
    static int limit=15;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

        for(int i=1; i<=limit; i++)
        {
            String input[]=(x.readLine()).trim().split(" ");
            ArrayList<Long> temp=new ArrayList<Long>();
            for(int j=0; j<i; j++)
            {
                long temp_no=Integer.parseInt(input[j]);
                temp.add(temp_no);
            }
            arr.add(temp);
        }
        long sum=arr.get(0).get(0);
        int prev=0;
        for(int i=1; i<limit; i++)
        {
            if(arr.get(i).get(prev)>arr.get(i).get(prev+1))
            {
                System.out.print(arr.get(i).get(prev)+"-->");
                sum=sum+arr.get(i).get(prev);
            }
            else
            {
                System.out.print(arr.get(i).get(prev+1)+"-->");
                sum=sum+arr.get(i).get(prev+1);
                prev=prev+1;
            }
        }
        System.out.println("\n"+sum);
    }
}
