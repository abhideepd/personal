package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class jump {
    public static void main(String []args)
    {
        int arr1[]={2,3,1,1,4};
        int arr2[]={2,3,0,1,4};
        int arr3[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int arr4[]={1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        /*
        System.out.println(function(arr1, 0));
        System.out.println(function(arr2, 0));
        System.out.println(function(arr3, 0));
        System.out.println(function(arr4, 0));
        */
        
        operation(arr1);
        operation(arr2);
        operation(arr3);
        operation(arr4);
    }
    static void operation(int []arr)
    {
        memo=new boolean[arr.length];
        System.out.println(function(arr, 0));
    }
    static boolean memo[];
    static int function(int []arr, int i)
    {
        //if(i>=arr.length)
        //return Integer.MAX_VALUE-1;

        if(i==arr.length-1)
        return 0;

        //memo[i]=true;

        int min=Integer.MAX_VALUE-1;
        for(int i1=1; i1<=arr[i]; i1++)
        {
            int temp=i+i1;
            if((temp<arr.length)&&(memo[temp]==false)&&(memo[temp]=true))
            min=Math.min(min, 1+function(arr, temp));
        }
        return min;
    }
}
