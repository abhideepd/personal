package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class knades 
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=1;
        //t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            //int size=Integer.parseInt(x.readLine());
            //String input=x.readLine();
            //driver(input);

            test();
        }
    }    
    static void test()
    {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("1 2 3 -2 5");
        arr.add("-1 -2 -3 -4");
        arr.add("-2 -3 4 -1 -2 1 5 -3");
        arr.add("1 2 3 -3 4 5 6 7");
        while(arr.size()!=0)
        driver(arr.remove(0));
    }
    static void driver(String inp)
    {
        String input[]=inp.split(" ");
        int arr[]=new int[input.length];

        for(int i=0; i<input.length; i++)
        arr[i]=Integer.parseInt(input[i]);

        print(arr);

        int curr_val=0, max_val=Integer.MIN_VALUE;
        for(int i=0; i<input.length; i++)
        {
            curr_val=curr_val+arr[i];

            if(curr_val>=max_val)
            max_val=curr_val;
            //else
            //curr_val=arr[i];

            if(curr_val<0)
            curr_val=0;
        }

        System.out.println(max_val);
    }
    static void print(int []arr)
    {
        System.out.println("Input:");
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}

