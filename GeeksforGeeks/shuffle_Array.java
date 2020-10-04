package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class shuffle_Array {
    static long arr[];
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        int size=input.length;
        arr=new long[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=Long.parseLong(input[i]);
        }
        shuffleArray(arr, size);
    }
    static void shuffleArray(long and[], int n)
    {
        // Your code goes here
    }
}
