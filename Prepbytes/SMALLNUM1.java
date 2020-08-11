package Prepbytes;
import java.io.*;
public class SMALLNUM1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        int K=Integer.parseInt(x.readLine());
        int arr[]=new int[100001];
        for(int i=0; i<size; i++)
        {
            int temp=Integer.parseInt(input[i]);
            arr[temp]=arr[temp]+1;
        }
        for(int i=0; i<100001; i++)
        {
            if(arr[i]==K)
            {System.out.println(i); break;}
        }
    }
}