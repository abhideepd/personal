package Prepbytes;
import java.io.*;
import java.util.*;
public class TRIPLET {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            int array[]=new int[1000001];
            int max=Integer.MIN_VALUE;
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
                array[arr[i]]=array[arr[i]]+1;
                if(max<arr[i])
                max=arr[i];
            }          
            int new_arr[]=new int[size];
            int k=0;
            for(int i=0; i<1000001; i++)
            {
                int counter=array[i];
                while(counter-->0)
                new_arr[k++]=i;
            }
            int ans1=-1, ans2=-1, ans3=-1;
            for(int i=0; i<size-2; i++)
            {
                for(int j=i+1; j<size-1; j++)
                {
                    long sum=new_arr[i]+new_arr[j];
                    if(sum>max)
                    break;
                    if(array[(int)sum]!=0)
                    {
                        if(sum>ans3)
                        {
                            ans1=new_arr[i];
                            ans2=new_arr[j];
                            ans3=(int)sum;
                        }
                    }
                }
            }
            if(ans1!=-1)
            System.out.println(ans3+" "+ans1+" "+ans2);
            else
            System.out.println(-1);
        }
    }
}