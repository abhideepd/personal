package Testing;
import java.io.*;
import java.util.*;
public class permutation 
{
    static Stack<Integer> permutation=new Stack<Integer>();
    static int n=0;
    static int counter=725760;
    static boolean choice[];
    static int limit=1000000;
    public static void main(String []args)
    {
        n=10;
        int arr[]={2,0,1,3,4,5,6,7,8,9};

        choice=new boolean[n];
        permutation(arr);
    }    
    static void permutation(int[] arr)
    {
        if(arr.length==permutation.size())
        {
            ++counter;
            if(counter==limit)
            System.out.println(counter+" "+permutation);
        }
        else
        {
            for(int i=0; i<n; i++)
            {
                if(choice[i])
                continue;
                choice[i]=true;
                permutation.push(arr[i]);
                permutation(arr);
                choice[i]=false;
                permutation.pop();
            }
        }
    }
}
