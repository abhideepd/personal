package Codeforces;
import java.io.*;
import java.util.*;
public class prob4 {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());

        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String inp[]=(x.readLine()).split(" ");
            int arr[]=new int[size];

            for(int i=0; i<size; i++)
            arr[i]=Integer.parseInt(inp[i]);

            Arrays.sort(arr);

            for(int i=1; i<size; i++)
            {
                if(arr[i]-arr[i-1]<2)
                arr[i-1]=-1;
            }
            int c=0;
            for(int i:arr)
            {
                if(i!=-1)
                ++c;
            }
            System.out.println(c==1?"YES":"NO");
        }
    }
}
