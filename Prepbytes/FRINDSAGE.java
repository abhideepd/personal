package Prepbytes;
import java.io.*;
import java.util.*;
public class FRINDSAGE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        int arr[]=new int[121];
        for(int i=0; i<N; i++)
        {
            int temp=Integer.parseInt(input[i]);
            arr[temp]=arr[temp]+1;
        }
        int result=0;
        for(int a=0; a<121; a++)
        {
            for(int b=0; b<121; b++)
            {
                if(b<=((0.5*a)+7))
                continue;

                if((b>100)&&(a<100))
                continue;

                if(b>a)
                continue;

                result=result+arr[a]*arr[b];

                if(b==a)
                result=result-arr[b];
            }
        }
        System.out.println(result);
    }
}