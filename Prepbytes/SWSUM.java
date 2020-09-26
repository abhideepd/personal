package Prepbytes;
import java.io.*;
import java.util.*;
public class SWSUM {
    static int input_array[];
    static int heap[];
    static int size_of_heap=0;
    static int start=0, end=0, max_sum=0;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        int N=Integer.parseInt(input1[0]);
        int S=Integer.parseInt(input1[1]);

        String input2[]=(x.readLine().split(" "));
        input_array=new int[N];
        heap=new int[N+1];
        for(int i=0; i<N; i++)
        {
            input_array[i]=Integer.parseInt(input2[i]);
        }
           
    }
}
