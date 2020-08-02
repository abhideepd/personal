package Prepbytes;
import java.io.*;
public class QUALITY {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        long arr[]=new long[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=Long.parseLong(input[i]);
        }
        long counter=0, result=0;
        for(int i=0; i<size; i++)
        {
            result=result + (long)Math.abs(counter-arr[i]);
            counter=arr[i];
        }
        System.out.println(result);
    }
}