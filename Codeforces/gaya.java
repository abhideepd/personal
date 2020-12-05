package Codeforces;
import java.io.*;
public class gaya 
{
    static int arr[];
    static int diff_arr[];
    static int n;
    static int k;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

        String n_k[]=(x.readLine()).split(" ");
        n=Integer.parseInt(n_k[0]);
        k=Integer.parseInt(n_k[1]);
        String inp_arr[]=(x.readLine()).split(" ");
        arr=new int[n];
        diff_arr=new int[n];

        //--    Input
        for(int i=0; i<n; i++)
        {
            arr[i]=Integer.parseInt(inp_arr[i]);
        }
        
        //--    Stores difference
        for(int i=1; i<n; i++)
        {
            diff_arr[i]=diff_arr[i]-diff_arr[i-1];
        }

        int l=0, r=2000000000;

        while(l<=r)
        {
            int m=(l+r)/2;
            if(f(m)==1)
            r=m-1;
            else
            l=m+1;
        }

        System.out.println(l);
    }    
    static int f(int min_diff)
    {
        long diff=0L;
        for(int i=1; i<n; i++)
        {

        }

        /*testing*/ return 1;
    }
}
