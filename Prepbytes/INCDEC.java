package Prepbytes;
import java.io.*;
public class INCDEC {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            for(int i=0; i<size; i++)
            arr[i]=Integer.parseInt(input[i]);

            int l=0, r=size;
            while(l<r)
            {
                int m=(l+r)/2;
                
                if(arr[m]<=arr[m+1])
                l=m+1;
                else
                r=m;
            }
            System.out.println(arr[r]);
            //System.out.println(r>=size?arr[size-1]:arr[r]);
        }
    }
}