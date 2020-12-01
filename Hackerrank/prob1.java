package Hackerrank;

import java.io.*;
import java.util.*;

public class prob1 {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine().trim());
        String input[]=(x.readLine().trim()).split(" ");
        int arr[]=new int[size];
        double median=0, mean=0, sum=0;
        
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input[i]);
            sum=sum+arr[i];
        }
        
        //  Mean
        mean=sum/size;
        
        Arrays.sort(arr);
        
        //  Median
        if(size%2==0)
        {
            median=(arr[(size/2)]+arr[(size/2)-1])/2.0D;
            ///*testing*/System.out.println("MEDIAN: "+arr[(size/2)]+" "+arr[(size/2)-1]);
        }
        else
        {
            median=arr[size/2];
        }
        
        //  Mode        
        int mode=arr[0], freq=1, temp_freq=1;
        for(int i=1; i<size; i++)
        {
            if(arr[i-1]==arr[i])
            ++temp_freq;
            else
            {
                if(temp_freq>freq)
                {
                    freq=temp_freq;
                    temp_freq=1;
                    mode=arr[i-1];
                }
            }
        }
        if(temp_freq>freq)
        {
            freq=temp_freq;
            temp_freq=1;
            mode=arr[size-1];
        }
        System.out.println(mean+"\n"+median+"\n"+mode);
    }
}