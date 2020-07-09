package Prepbytes;
import java.io.*;
public class MAXPROBS {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        int n=Integer.parseInt(input[0]);
        int k=Integer.parseInt(input[1]);
        k=240-k;
        int arr[]=new int[11];
        arr[0]=0;
        int result=0;
        for(int i=1; i<11; i++)
        {
            arr[i]=(((i)*(i+1))*5)/2;
            if(arr[i]>k)
            {result=i-1; break;}
        }
        if(result>n)
        System.out.println(n);
        else
        System.out.println(result);
        //System.out.println(n+" "+result);
    }
}