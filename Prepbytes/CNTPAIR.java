package Prepbytes;
import java.io.*;
public class CNTPAIR {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //input size and 'K'
        String input1[]=(x.readLine()).split(" ");
        int size=Integer.parseInt(input1[0]);
        int K=Integer.parseInt(input1[1]);
        //Input array
        String input2[]=(x.readLine()).split(" ");
        //convert input array to integer
        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input2[i]);
        }
        int index[]=new int[1000000001];
        for(int i=0; i<size; i++)
        {
            
        }
    }
}