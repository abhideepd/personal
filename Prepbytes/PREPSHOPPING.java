package Prepbytes;
import java.io.*;
import java.util.*;
public class PREPSHOPPING {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T;i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            int size=Integer.parseInt(input1[0]);
            int K=Integer.parseInt(input1[1]);
            String input2[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            for(int i=0; i<size;i++)
            {
                arr[i]=Integer.parseInt(input2[i]);
            }
            Arrays.sort(arr);
        }
    }
}