package Prepbytes;
import java.io.*;
import java.util.*;
public class NUMCHOC {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //Input size
        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        //convert array to integer
        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        int q=Integer.parseInt(x.readLine());
        
        for(int i=0; i<q; i++)
        {
            int inp=Integer.parseInt(x.readLine());
            //System.out.print("Answer:");
            if(inp<arr[0])
            System.out.println(0);
            else if(inp>arr[arr.length-1])
            System.out.println(arr.length);
            else{
                //binary search
                int l=0;
                int r=size-1;
                int m=(l+r)/2;
                while(l<=r)
                {
                    //System.out.println(l+" "+r);
                    if(arr[m]>inp)
                    r=m-1;
                    else if(arr[m]<=inp)
                    l=m+1;
                    m=(l+r)/2;                    
                }
            System.out.println((m+1));
            }
        }
    }
}