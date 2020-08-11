package Prepbytes;
import java.io.*;
import java.util.*;
public class MINABS {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0; i<size-1; i++)
        {
            int temp=arr[i+1]-arr[i];
            if(min>temp)
            min=temp;
        }
        System.out.println(min);
    }
}