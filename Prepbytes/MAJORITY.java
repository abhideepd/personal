package Prepbytes;
import java.io.*;
public class MAJORITY {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            
            System.out.println(func(input));
        }
    }
    static int func(String []inp)
    {
        int arr[]=new int[10000000];
        int size=inp.length;
        int sisi=size/2;
        for(int i=0; i<size; i++)
        {
            int temp=Integer.parseInt(inp[i]);
            arr[temp]=arr[temp]+1;
            if(arr[temp]>sisi)
            return temp;
        }
        return -1;
    }
}