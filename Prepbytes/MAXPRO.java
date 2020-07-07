package Prepbytes;
import java.io.*;
public class MAXPRO {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[size+1];
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
            }
            arr[size]=-1;
            int arr1[]=new int[size+1];
            int prev=arr1[0];
            for(int i=1; i<size+1; i++)
            {
                if(prev>arr[i])
                arr1[i-1]=1;
                prev=arr[i];
            }
            
            for(int i=0; i<size; i++)
            {
                System.out.print(arr1[i]+" ");
            }

            int a=10000000;
            int min=a;
            int result=0;
            for(int i=0; i<size; i++)
            {
                if(arr1[i]==1)
                {
                    if(min!=a)
                    {
                        
                    }
                }
                else
                {

                }
            }
        }
    }
}