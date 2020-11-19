package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class rotate_180_deg {
    public static void main(String []args)
    {
        test();
    }
    static void test()
    {
        int a1[][]={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int a2[][]={{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int a3[][]={{1, 2, 3}, {4, 5, 6}};
        int a4[][]={{1, 2},{3, 4}};

        operation(a1);
        //operation(a2);
        //operation(a3);
        //operation(a4);
    }
    static void operation(int [][]arr)
    {
        System.out.println("Input: ");
        print(arr);
        driver(arr);
        System.out.println("Output: ");
        print(arr);
    }
    static void driver(int [][]arr)
    {
        int m=arr.length;
        int n=arr[0].length;
        int size=0;

        for(int i=0; i<m/2; i++)
        {
            for(int j=0; j<n; j++)
            {
//                swap()
            }
        }
    }
    static void print(int [][]arr)
    {
        StringBuilder output=new StringBuilder();
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            output.append(arr[i][j]+" ");
            output.append("\n");
        }
        System.out.println(output);
    }
}
