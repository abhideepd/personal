package Hackerrank;
import java.io.*;
import java.util.*;
public class and_xor_or 
{
    public static void main(String []args)throws IOException
    {
        String file="/home/dRazz3R/Documents/Code/personal/Hackerrank/input1.txt";
        //BufferedReader x=new BufferedReader(new FileReader(file));
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        arr[i]=Integer.parseInt(input[i]);
        System.out.println(andXorOr(arr));
    }
    static int andXorOr(int[] a) 
    {
        int nearest_smallest[][]=nearest_smallest(a);
        //int nearest_smallest_left[]=nearest_smallest_left(a);
        //int nearest_smallest_right[]=nearest_smallest_right(a);

        int nearest_smallest_left[]=nearest_smallest[0];
        int nearest_smallest_right[]=nearest_smallest[1];

        int ans=Integer.MIN_VALUE;
        //print(nearest_smallest_right);
        //print(nearest_smallest_left);
        for(int i=0; i<a.length; i++)
        {
           ans=Math.max(ans, function(a[i], nearest_smallest_right[i]));
           ans=Math.max(ans, function(a[i], nearest_smallest_left[i]));
        }
        return ans;
    }
    static void print(int []a)
    {
        for(int i:a)
        System.out.print(i+" ");
        System.out.println();
    }
    static int function(int M1, int M2)
    {
        return (((M1&M2)^(M1|M2))&(M1^M2));
    }
    static int[] nearest_smallest_left(int []a)
    {
        int ans[]=new int[a.length];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0; i<a.length; i++)
        {
            while((s.size()!=0)&&(s.peek()>=a[i]))
            s.pop();

            if(s.size()==0)
            ans[i]=a[i];
            else
            ans[i]=s.peek();
            s.push(a[i]);
        }
        return ans;
    }
    static int[] nearest_smallest_right(int []a)
    {
        int ans[]=new int[a.length];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=a.length-1; i>=0; i--)
        {
            while((s.size()!=0)&&(s.peek()>=a[i]))
            s.pop();

            if(s.size()==0)
            ans[i]=a[i];
            else
            ans[i]=s.peek();
            s.push(a[i]);
        }
        return ans;
    }
    static int[][] nearest_smallest(int []a)
    {
        int ans[][]=new int[2][a.length];
        Stack<Integer> s_left=new Stack<Integer>();
        Stack<Integer> s_right=new Stack<Integer>();
        //  [0] --> LEFT
        //  [1] --> RIGHT
        for(int i=0; i<a.length; i++)
        {
            //      LEFT
            while((s_left.size()!=0)&&(s_left.peek()>=a[i]))
            s_left.pop();

            if(s_left.size()==0)
            ans[0][i]=a[i];
            else
            ans[0][i]=s_left.peek();
            s_left.push(a[i]);
            
            //  RIGHT
            int j=a.length-i-1;
            while((s_right.size()!=0)&&(s_right.peek()>=a[j]))
            s_right.pop();

            if(s_right.size()==0)
            ans[1][j]=a[j];
            else
            ans[1][j]=s_right.peek();
            s_right.push(a[j]);
        }
        return ans;
    }
}
