package Prepbytes;
import java.io.*;
import java.util.*;
public class BINARRNG {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input=x.readLine();
        int arr[]=new int[input.length()];
        int arr_freq[]=new int[input.length()];
        int k=0;
        int ans=1;
        int prev=Integer.parseInt(input.charAt(0)+"");
        int total_0=prev==0?1:0;
        int total_1=prev==1?1:0;
        for(int i=1; i<input.length(); i++)
        {
            int temp=Integer.parseInt(input.charAt(i)+"");

            if(temp==0)
            ++total_0;

            if(temp==1)
            ++total_1;

            if(prev==temp)
            {
                ++ans;
            }
            else{
                arr[k]=prev;
                arr_freq[k]=ans;
                ans=1;
                prev=temp;
                ++k;
            }
        }
        arr[k]=prev;
        arr_freq[k]=ans;
        int h=0;
        int anss=0;
        //System.out.println(total_0+" "+total_1);
        //print(arr, arr_freq, k);
        while((total_0>0)&&(total_1>0))
        {
            if(arr[h]==1)
            {
                if(arr_freq[h]<=total_0)
                {
                    anss=anss+arr_freq[h];
                    total_1=total_1-arr_freq[h];
                }
                else{
                    anss=anss+total_0;
                    total_0=0;
                }
            }
            else{
                if(arr_freq[h]<=total_1)
                {
                    anss=anss+arr_freq[h];
                    total_0=total_0-arr_freq[h];
                }
                else{
                    anss=anss+total_1;
                    total_1=0;
                }
            }
            ++h;
        }
        System.out.println(anss);       
    }
    static void print(int []arr1, int []arr2, int k)
    {
        for(int i=0; i<=k; i++)
        {
            System.out.println(arr1[i]+" ---> "+arr2[i]);
        }
    }
    static void print(int []arr1, int k)
    {
        for(int i=0; i<=k; i++)
        {
            System.out.println(arr1[i]);
        }
    }
    static void print(int []arr1)
    {
        for(int i=0; i<arr1.length; i++)
        {
            System.out.println(arr1[i]);
        }
    }
}