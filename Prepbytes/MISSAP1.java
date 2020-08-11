package Prepbytes;
import java.io.*;
public class MISSAP1 {
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
            int r=(arr[0]+arr[size-1])/size;

            for(int i=1; i<size; i++)
            {
                if(arr[i-1]+r!=arr[i])
                {
                    System.out.println(arr[i-1]+r);
                    break;
                }
            }
        }
    }
}