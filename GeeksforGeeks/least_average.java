package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class least_average {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=0;
        //t=Integer.parseInt(x.readLine());
        test();
        for(int i1=0; i1<t; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            String input2[]=(x.readLine()).split(" ");
            int k=Integer.parseInt(input1[1]);
            driver(input2, k);
        }
    }
    static void test()
    {
        ArrayList<String> arr=new ArrayList<String>();
        ArrayList<Integer> _k=new ArrayList<Integer>();
        //Input starts
        _k.add(1);
        arr.add("30 20 10");
        _k.add(1);
        arr.add("90 30 21 10 23 34 30 30 30");
        _k.add(1);
        arr.add("30 30 30 30 -30");
        _k.add(1);
        arr.add("-30 202 20 20 2");
        _k.add(2);
        arr.add("1 -1 1 1 1 1");
        _k.add(2);
        arr.add("30 20 10");
        _k.add(1);
        arr.add("10 20 30 40");
        _k.add(2);
        arr.add("10 20 30 40");
        //Input Ends
        while(arr.size()!=0)
        {
            String temp_1=arr.remove(0);
            String temp[]=temp_1.split(" ");
            System.out.println("Input: "+temp_1);
            
            int k=_k.remove(0);
            System.out.println("k: "+k);

            driver(temp, k);
        }
    }
    static void driver(String []input, int k)
    {
        int arr[]=new int[input.length];
        for(int i=0; i<input.length; i++)
        arr[i]=Integer.parseInt(input[i]);

        int sum=0, k1=0, min=Integer.MAX_VALUE;
        int first_index=0, last_index=0;
        for(int i=0; i<input.length; i++)
        {
            sum=sum+arr[i];
            if(i>=k-1)
            {
                //sum=sum-arr[k1++];
                int temp=sum/k;
                if(min>temp)
                {
                    min=temp;
                    first_index=k1;
                    last_index=i;
                }
                sum=sum-arr[k1++];
            }
        }
        System.out.println("Min: "+min);    //--test
        System.out.println(first_index+1+" "+(last_index+1));
    }
}
