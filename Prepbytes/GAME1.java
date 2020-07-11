package Prepbytes;
import java.io.*;
import java.util.*;
public class GAME1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
            }
            Arrays.sort(arr);
            int n=(size/2)+(size%2);
            //System.out.println("n: "+n);
            System.out.println(arr[n-1]);
        }
    }
}