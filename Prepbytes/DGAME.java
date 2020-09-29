package Prepbytes;
import java.io.*;
import java.util.*;
public class DGAME {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int N=Integer.parseInt(input[0]);
            int M=Integer.parseInt(input[1]);
            ArrayList<Integer> digit_array=digit_to_array(N);
            int k=0;

            while(M-->0)
            {
                digit_array.set(k++, -1);
            }
            int flag=0;
            while(flag!=-1)
            {
                
            }
        }
    }
    static ArrayList<Integer> digit_to_array(int N)
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(N!=0)
        {
            int temp=N%10;
            arr.add(temp);
            N=N/10;
        }
        Collections.sort(arr);
        return arr;
    }
}
