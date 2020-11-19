package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class two_pointer {
    public static void main(String []args)throws IOException
    {
        arrays_and_sum();
        System.out.println();
    }
    static void arrays_and_sum()
    {
        int arr1[]={0, -1, 2, -3, 1};
        int sum1=-2;
        driver(arr1, sum1);

        int arr2[]={1, -2, 1, 0, 5};
        int sum2=0;
        driver(arr2, sum2);

        int arr3[]={1, 4, 45, 6, 10, 8};
        int sum3=16;
        driver(arr3, sum3);

        int arr4[]={1, 2, 4, 3, 6};
        int sum4=10;
        driver(arr4, sum4);
    }
    static void driver(int []arr, int sum)
    {
        Arrays.sort(arr);
        print_input(arr, sum);
        System.out.println(operation(arr, sum));
    }
    static boolean operation(int []arr, int sum)
    {
        int l=0, r=arr.length-1;
        //ArrayList<int> arr;

        while((l<r))
        {
            int val=arr[l]+arr[r];

            //test_print(l, r, val);

            if(val>sum)
            --r;
            else if(val<sum)
            ++l;
            else
            return true;
        }
        return false;
    }
    static void test_print(int l, int r, int val)
    {
        System.out.println("l:"+l+" r:"+r+" val:"+val);
    }
    static void print_input(int []arr, int sum)
    {
        StringBuilder output=new StringBuilder();
        for(int i:arr)output.append(i+" ");
        System.out.println("\nInput array:"+output+" sum:"+sum);
    }
}
