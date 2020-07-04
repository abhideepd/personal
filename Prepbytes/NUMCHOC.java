package Prepbytes;
import java.io.*;
import java.util.*;
public class NUMCHOC {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //Input size
        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        //convert array to integer
        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        int q=Integer.parseInt(x.readLine());
        for(int i=0; i<q; i++)
        {
            int inp=Integer.parseInt(x.readLine());
            if(inp<arr[0])
            System.out.println(0);
            else if(inp>arr[arr.length-1])
            System.out.println(arr.length);
            else{
                int result=0;
                for(int i1=0; i1<arr.length; i1++)
                {
                    if(arr[i1]>inp)
                    break;
                    ++result;
                }
                System.out.println(result);
            }
        }
    }
}