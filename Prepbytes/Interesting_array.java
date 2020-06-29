package Prepbytes;
import java.io.*;
public class Interesting_array {

    public static void main(String[] args)throws IOException 
    {

        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());

        for(int i=0; i<T; i++)
        {
            int size=Integer.parseInt(x.readLine());//size of input array
            String input[]=(x.readLine()).split(" ");//input array itself
            int Index=Integer.parseInt(x.readLine());//Index

            //convert string array to Integer
            int arr[]=new int[size];
            for(int i1=0; i1<size; i1++)
            {
                arr[i1]=Integer.parseInt(input[i1]);
            }

            System.out.println(answer(arr, Index));
        }
    }
    static String answer(int arr[], int Index)
    {
        int i=0, j=arr.length-1;

        while(i<j)
        {
            if((arr[i]+arr[j])>Index)
            {
                --j;
            }
            else if((arr[i]+arr[j])<Index)
            {
                ++i;
            }
            else{
                String temp=i+" "+j;
                return temp;
            }
        }
        return "no answer";
    }
}