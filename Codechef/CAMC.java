package Codechef;
import java.io.*;
import java.util.*;
public class CAMC {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            String input_arr[]=(x.readLine()).split(" ");
            int size=Integer.parseInt(input[0]);
            int M=Integer.parseInt(input[1]);     
            int arr[]=new int[size];
            
            for(int i=0; i<size; i++)
            arr[i]=Integer.parseInt(input_arr[i]);

            M=M-1;
            Arrays.sort(arr);
            int min=Integer.MAX_VALUE;

            for(int i=M; i<size; i++)
            {
                int index=i-M;
                int temp=arr[i]-arr[index];

                if(temp<min)
                min=temp;
            }

            System.out.println(min);
        }
    }
}