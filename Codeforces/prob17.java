package Codeforces;
import java.io.*;
import java.util.*;
public class prob17 {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

        int size=Integer.parseInt(x.readLine());
        String inp_array[]=(x.readLine()).split(" ");
        int arr[]=new int[size];

        for(int i=0; i<size; i++)
        arr[i]=Integer.parseInt(inp_array[i]);

        HashMap<Long, Long> hm=new HashMap<Long, Long>();
        long sum=0, ans=0, zero=0;
        hm.put(zero, zero);

        for(int i=0; i<size; i++)
        {
            sum=sum+arr[i];

            if(hm.containsKey(sum))
            {
                ++ans;
                hm=new HashMap<Long, Long>();
                hm.put(zero, zero);
                sum=arr[i];
            }
            hm.put(sum, zero);
        }
        System.out.println(ans);
    }
}
