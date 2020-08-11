package Prepbytes;
import java.io.*;
public class TRANSPOINT1 {
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
            
            if(arr[0]==1)
            System.out.println(0);
            else if(arr[size-1]==0)
            System.out.println(-1);
            else{
                int l=0, r=size-1;
                while(l<r)
                {
                    int m=(l+r)/2;
                    if(arr[m]==1)
                    r=m;
                    else
                    l=m+1;
                }
                System.out.println(r);
            }
        }
    }
}