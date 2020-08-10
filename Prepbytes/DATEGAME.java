package Prepbytes;
import java.io.*;
public class DATEGAME {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        String DM[]=(x.readLine()).split(" ");

        int D=Integer.parseInt(DM[0]);//sum
        int M=Integer.parseInt(DM[1]);//length of segment
        int ans=0;
        int arr[]=new int[size];
        int prev=0;
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input[i])+prev;
            prev=arr[i];
        }
        prev=0;
        for(int i=0; i<=(size-M); i++)
        {
            int temp=arr[i+M-1]-prev;
            if(temp==D)
            ++ans;
            prev=arr[i];
        }
        System.out.println(ans);
    }
}