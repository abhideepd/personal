package Hackerrank;
import java.io.*;
import java.util.*;
public class tu_stacks 
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        HashMap<Integer, Integer> answer=new HashMap<Integer, Integer>();
        int k=1;
        while(t-->0)
        {
            String input0[]=(x.readLine()).split(" ");
            String input1[]=(x.readLine()).split(" ");
            String input2[]=(x.readLine()).split(" ");
            int a[]=conversion(input1);
            int b[]=conversion(input2);
            //System.out.println("Answer: "+twoStacks(Integer.parseInt(input0[2]), a, b));
            answer.put(k++, twoStacks(Integer.parseInt(input0[2]), a, b));
        }
        System.out.println("Answer: "+answer);
    }
    static int[] conversion(String x[])
    {
        int arr[]=new int[x.length];
        for(int i=0; i<x.length; i++)
        arr[i]=Integer.parseInt(x[i]);
        return arr;
    }
    static int twoStacks(int x, int[] a, int[] b) 
    {
        long sum=0;
        int k=0;
        int ans=0;
        while((k<a.length)&&(sum+a[k]<=x))
        {
            sum=sum+a[k++];
            if(sum<=x)
            ++ans;
        }
        int flag=0;
        int l=0;
        --k;
        int temp=ans;
        //System.out.println("sum: "+sum);
        while((l<b.length)&&(flag==0))
        {            
            if(sum+b[l]<=x)
            {              
                //System.out.print(sum+" + "+b[l]);  
                sum=sum+b[l];
                //System.out.println(" = "+sum+" ---->"+temp);
                l++;
                ++temp;
            }
            else
            {
                if(k>=0)
                {
                    //System.out.print(sum+" - "+a[k]);                      
                    sum=sum-a[k];
                    //System.out.println(" = "+sum+" ----> "+temp);
                    --k;
                    --temp;
                }
                else
                {
                    flag=1;
                }
            }
            ans=Math.max(ans, temp);
        }
        return ans;
    }
}