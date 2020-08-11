package Prepbytes;
import java.io.*;
public class FACESUN1 {
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
            int max=Integer.MIN_VALUE;
            int counter=0;
            for(int i=0; i<size; i++)
            {
                if(max<arr[i])
                {
                    max=arr[i];
                    ++counter;
                }
            }
            System.out.println(counter);
        }
    }
}