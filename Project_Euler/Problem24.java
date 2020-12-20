package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem24 
{
    static int arr[]={0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static void main(String []args)throws IOException
    {
        int counter=0;
        int limit=100;
        print();
        for(int i=1; i<10; i++)
        {
            for(int j=9; j>=i; j--)
            {
                //System.out.println("i: "+i+"  j:"+j);
                if(arr[j]>arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    ++counter;
                    j=10;
                    System.out.print("j:"+j+"   ");print();
                }
                if(counter==limit)
                break;
            }
            if(counter==limit)
            break;
        }
    }
    static void print()
    {
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
    }
}
