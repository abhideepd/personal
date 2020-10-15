package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class alternate_pos_neg_1 {
    public static void main(String args[])throws IOException
    {
        tc_1 obj_testcases=new tc_1();

        //-- Input starts

        driver(obj_testcases.inp18);

        //-- Input ends

        //call all inputs
        //go_all_in(obj_testcases);

        
    }
    static void go_all_in(tc_1 obj_testcases)
    {
        driver(obj_testcases.inp1);
        driver(obj_testcases.inp2);
        driver(obj_testcases.inp3);
        driver(obj_testcases.inp4);
        driver(obj_testcases.inp5);
        driver(obj_testcases.inp6);
        driver(obj_testcases.inp7);
        driver(obj_testcases.inp8);
        driver(obj_testcases.inp9);
        driver(obj_testcases.inp10);
        driver(obj_testcases.inp11);
        driver(obj_testcases.inp12);
        driver(obj_testcases.inp13);
        driver(obj_testcases.inp14);
        driver(obj_testcases.inp15);
        driver(obj_testcases.inp16);
        driver(obj_testcases.inp17);
        driver(obj_testcases.inp18);
        driver(obj_testcases.inp19);
        driver(obj_testcases.inp20);
    }
    static void driver(String ioa)
    {
        String inp[]=ioa.split(" ");
        int arr[]=new int[inp.length];
        for(int i=0; i<inp.length; i++)
        arr[i]=Integer.parseInt(inp[i]);

        Solution___ obj=new Solution___();
        System.out.println();
        System.out.println("Input: ");
        obj.output(arr);
        obj.rearrange(arr, arr.length);
        System.out.println("Output: ");
        obj.output(arr);
        System.out.println();
    }
}

class Solution___ {
    void rearrange(int arr[], int n) 
    {
        // code here

        //--  1st positive then negative without changing order

        //(0, 2, 4, 6, 8....) ----> positive integers
        //(1, 3, 5, 7, 9....) ----> negative integers

        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                
            }
        }
    }
    void swap(int arr[], int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    void output(int []arr)
    {
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}