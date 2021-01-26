package Hackerrank;
import java.io.*;
import java.util.*;
public class Largest_Rectangle 
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //int t=Integer.parseInt(x.readLine());
        int t=1;
        while(t-->0)
        {
            int n=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[n];
            for(int i=0; i<n; i++)
            arr[i]=Integer.parseInt(input[i]);
            System.out.println((long)largestRectangle(arr));
        }
    }    
    static long largestRectangle(int[] h) 
    { 
        int nearest_smallest_left[] =nearest_smallest_left(h);
        int nearest_smallest_right[]=nearest_smallest_right(h);

        //print(h, nearest_smallest_left, nearest_smallest_right);

        long ans_max_area=Long.MIN_VALUE;

        //System.out.println("\nArea:-");

        for(int i=0; i<h.length; i++)
        {
            int temp_left=i-nearest_smallest_left[i];
            int temp_right=nearest_smallest_right[i]-i;

            //System.out.println(temp_left+" : "+temp_right);

            if(temp_left==0)
            temp_left=i;
            else
            temp_left=temp_left-1;

            if(temp_right==0)
            temp_right=h.length-i-1;
            else
            temp_right=temp_right-1;

            long temp_size=temp_left+temp_right+1;

            //System.out.println(h[i]+" : "+temp_size*h[i]+"   "+temp_left+" "+temp_right);

            ans_max_area=Math.max(ans_max_area, temp_size*(long)h[i]);
        }

        //System.out.print("\nAnswer                : ");
        return ans_max_area;
    }
    static void print(int []input, int []nearest_smallest_left, int []nearest_smallest_right)
    {
        int input_index[]=new int[input.length];

        for(int i=0; i<input.length; i++)
        input_index[i]=i;

        System.out.print("\nInput                 : ");print(input_index, input);
        System.out.print("\nnearest smallest left : ");print(nearest_smallest_left, input);
        System.out.print("\nnearest smallest right: ");print(nearest_smallest_right, input);
    }
    static void print(int a[], int input[])
    {
        for(int i:a)
        System.out.print(input[i]+" ");
    }
    static int[] nearest_smallest_left(int []a)
    {
        int ans[]=new int[a.length];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0; i<a.length; i++)
        {
            while((s.size()!=0)&&(a[s.peek()]>=a[i]))
            s.pop();

            if(s.size()==0)
            ans[i]=i;
            else
            ans[i]=s.peek();
            s.push(i);
        }
        return ans;
    }
    static int[] nearest_smallest_right(int []a)
    {
        int ans[]=new int[a.length];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=a.length-1; i>=0; i--)
        {
            while((s.size()!=0)&&(a[s.peek()]>=a[i]))
            s.pop();

            if(s.size()==0)
            ans[i]=i;
            else
            ans[i]=s.peek();
            s.push(i);
        }
        return ans;
    }
}
