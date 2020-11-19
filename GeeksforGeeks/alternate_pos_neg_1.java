package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class alternate_pos_neg_1 {
    public static void main(String args[])throws IOException
    {
        tc_1 obj_testcases=new tc_1();

        //-- Input starts

        driver(obj_testcases.inp23);

        //-- Input ends

        //call all inputs
        go_all_in(obj_testcases);

        
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
        driver(obj_testcases.inp21);
        driver(obj_testcases.inp22);
        driver(obj_testcases.inp23);
        driver(obj_testcases.inp24);
        driver(obj_testcases.inp25);
        driver(obj_testcases.inp26);
        driver(obj_testcases.inp27);
        driver(obj_testcases.inp28);
        driver(obj_testcases.inp47);
        driver(obj_testcases.inp30);
        driver(obj_testcases.inp31);
        driver(obj_testcases.inp32);
        driver(obj_testcases.inp33);
        driver(obj_testcases.inp34);
        driver(obj_testcases.inp35);
        driver(obj_testcases.inp36);
        driver(obj_testcases.inp37);
        driver(obj_testcases.inp38);
        driver(obj_testcases.inp39);
        driver(obj_testcases.inp40);
        driver(obj_testcases.inp41);
        driver(obj_testcases.inp42);
        driver(obj_testcases.inp43);
        driver(obj_testcases.inp44);
        driver(obj_testcases.inp45);
        driver(obj_testcases.inp46);
        driver(obj_testcases.inp47);
        driver(obj_testcases.inp48);
        driver(obj_testcases.inp49);
        driver(obj_testcases.inp50);
        driver(obj_testcases.inp51);
        driver(obj_testcases.inp52);
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
        //obj.rotate(arr, 1, 5);
        obj.rearrange(arr, arr.length);
        System.out.println("Output: ");
        obj.output(arr);
        System.out.println();
    }
}

class Solution___ 
{
    void rearrange(int arr[], int n) 
    {
        // code here

        //--  1st positive then negative without changing order

        //(0, 2, 4, 6, 8....) ----> even position - positive integers
        //(1, 3, 5, 7, 9....) ----> odd position - negative integers

        for(int i=0; i<n; i++)
        {
            //even position--negative value
            if(even(i)&&(neg(arr[i])))
            {
                int temp=i;
                while((++temp<n)&&(neg(arr[temp])));
                if(temp==n)
                break;
                rotate(arr, i, temp);
            }

            //odd position--positive value
            else if(odd(i)&&pos(arr[i]))
            {
                int temp=i;
                while((++temp<n)&&(pos(arr[temp])));
                if(temp==n)
                break;
                rotate(arr, i, temp);
            }
        }
    }

    boolean neg(int a)
    {return a<0?true:false;}

    boolean pos(int a)
    {return a>=0?true:false;}

    boolean even(int i)
    {return (i%2)==0?true:false;}

    boolean odd(int i)
    {return (i%2)==1?true:false;}

    void rotate(int []arr, int i, int j)
    {
        //code
        int temp=arr[j];
        for(; j>i; j--)
        {
            arr[j]=arr[j-1];
        }
        arr[i]=temp;
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