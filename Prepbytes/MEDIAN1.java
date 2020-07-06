package Prepbytes;
import java.io.*;
import java.util.*;
public class MEDIAN1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        int size=Integer.parseInt(input1[0]);
        int K=Integer.parseInt(input1[1]);
        String input2[]=(x.readLine()).split(" ");
        //convert the array to string
        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input2[i]);
        }
        Arrays.sort(arr);
        int n=((size+1)/2)-1;
        System.out.println(arr[n]+K);
    }
}