package Prepbytes;
import java.io.*;
public class combi {
    public static void main(String[] args)throws IOException 
    {     
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());    //Size of array
        String input[]=(x.readLine()).split(" ");   //array itself
        int K=Integer.parseInt(x.readLine());   //subsequence of length 'K'<-- input here

        //change string input to integer
        int arr[]= new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input[i]);
        }
        int res[]=new int[K];
        
        //Initialize 'res' array with -1
        for(int i=0; i<K; i++)
        {
            res[i]=-1;
        }

        //System.out.println("Output :-");
        output(arr, res, 0, -1);
    }

    static void output(int []arr, int []res, int Index, int arri)
    {
        if(Index==res.length)
        {
            if(res[res.length-1]==-1)
            {
                return;
            }
            else
            {
                print(res);
                return;
            }
        }

        for(int i=arri+1; i<arr.length; i++)
        {
            //System.out.println("Index--> "+ Index);
            res[Index]=arr[i];
            output(arr, res, Index+1, i);
        }
    }

    static void print(int []arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}