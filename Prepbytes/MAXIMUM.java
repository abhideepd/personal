package Prepbytes;
import java.io.*;
public class MAXIMUM {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input[i]);
        }
        if(check(arr))
        System.out.println(-1);
        else{
            for(int i=size-1; i>=0; i--)
            {
                int r=0;
                int l=r+i;
                int breaker=0;

                while(l<size)
                {
                    //System.out.println(r+" "+l);
                    if(arr[l]>arr[r])
                    {
                        breaker=1;
                        break;
                    }
                    else{
                        ++r;
                        l=r+i;
                    }                    
                }
                if(breaker==1)
                {
                    //System.out.println(l+" "+r);
                    System.out.println((l-r));
                    break;
                }
            }
        }
    }
    static boolean check(int []arr)
    {
        int prev=arr[0];
        for(int i=1; i<arr.length;i++)
        {
            if(prev<arr[i])
            return false;
            prev=arr[i];
        }
        return true;
    }
}