package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class max_profit {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

        test();
    }
    static void test()
    {
        ArrayList<String> arr1=new ArrayList<String>();


        //int arr2={};
        //driver(arr2);
        
        //Input Starts

        //arr1.put("1 2 3 4 5 6");

        //Input ends
        
        while(arr1.size()!=0)
        {
            String inp[]=arr1.remove(0).split(" ");

            int arr[]=new int[inp.length];

            for(int i=0; i<inp.length; i++)
            arr[i]=Integer.parseInt(inp[i]);

            driver(arr);
        }
    }
    static void driver(int []arr)
    {
        
    }
}
