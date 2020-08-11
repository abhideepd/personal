package Prepbytes;
import java.io.*;
import java.util.*;
public class REPLACE {
     public static void main(String[] args)throws IOException {
         BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
         int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            int arr1[]=new int[size];
            int ans=0;
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
                arr1[i]=Integer.parseInt(input[i]);
            }
            Arrays.sort(arr);
            for(int i=0; i<size; i++)
            {
                if(arr[i]!=arr1[i])
                ++ans;
            }
            System.out.println(ans);
        }   
     }
}