package Prepbytes;
import java.io.*;
public class zigzag {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");

        //convert input to integer
        int arr1[]=new int[size];
        int arr2[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr1[i]=Integer.parseInt(input[i]);
            arr2[i]=Integer.parseInt(input[i]);
        }

        int result1=res(0, arr1, size, 1);        
        int result2=res(0, arr2, size, 0);
        //System.out.println("result: "+result1+" "+result2);           //--Testing Purposes
        
        int result=result1>=result2?result2:result1;
        System.out.println(result);
    }
    static int res(int result, int arr[], int size, int Index)
    {
        /*
        if(Index>=size)
        {
            return result;
        }

        if(Index==0)
        {
            if(arr[Index]>=arr[Index+1])
            {
                result=result+arr[Index]-arr[Index+1]+1;
                arr[Index]=arr[Index+1]-1;
            }
        }
        else if(Index==(size-1))
        {
            if(arr[Index]>=arr[Index-1])
            {
                result=result+arr[Index]-arr[Index-1]+1;
                arr[Index]=arr[Index-1]-1;
            }
        }
        else
        {
            int min=arr[Index-1]<=arr[Index+1]?arr[Index-1]:arr[Index+1];

            if(min<=arr[Index])
            {
            result = result + (arr[Index]-min) + 1;
            arr[Index]=min-1;
            }
        }

        return res(result, arr, size, Index+2);
        */
        for(int i=Index; i<size; i+=2)
        {
            if(i==0)
            {
                if(arr[i]>=arr[i+1])
                {
                    result=result+arr[i]-arr[i+1]+1;
                    arr[i]=arr[i+1]-1;
                }
            }
            else if(i==(size-1))
            {
                if(arr[i]>=arr[i-1])
                {
                    result=result+arr[i]-arr[i-1]+1;
                    arr[i]=arr[i-1]-1;
                }
            }
            else
            {
                int min=arr[i-1]<=arr[i+1]?arr[i-1]:arr[i+1];
    
                if(min<=arr[i])
                {
                result = result + (arr[i]-min) + 1;
                arr[i]=min-1;
                }
            }
        }
        return result;
    }
  //Testing Purposes
    static void printt(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}