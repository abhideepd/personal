//package Prepbytes;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //input no. of test cases
        int T=Integer.parseInt(x.readLine());
        
        for(int i1=0; i1<T; i1++)
        {
            //Input size and 'x'
            String input1[]=(x.readLine()).split(" ");
            int size=Integer.parseInt(input1[0]);
            int aex=Integer.parseInt(input1[1]);
            //Input sorted array
            String input2[]=(x.readLine()).split(" ");
            //change string array to integer
            int arr[]=new int[size];

            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input2[i]);
            }

            //TESTING
            //System.out.print("Result:- ");

            if(arr[0]>aex)
            System.out.println(-1);
            else if(arr[0]==aex)
            System.out.println(0);
            else if(arr[arr.length-1]<=aex)
            System.out.println(arr.length-1);
            else
            System.out.println(beberexa(arr, aex));
        }
    }
    public static int beberexa(int []arr, int x)
    {
        int l=0;
        int r=arr.length;
        int m=(l+r)/2;

        while(l<r)
        {
            //System.out.println(l+" "+r);
            if(arr[m]>x)
            {
                r=m-1;
            }
            else if(arr[m]==x)
            {
                return m;
            }
            else
            {
                l=m+1;
            }

            m=(l+r)/2;
        }
        if(arr[m]>x)
        --m;
        return m;
    }
}