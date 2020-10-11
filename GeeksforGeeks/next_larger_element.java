package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class next_larger_element {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            long arr[]=new long[size];
            for(int i=0; i<size; i++)
            {
                arr[i]=Long.parseLong(input[i]);
            }
            long answer[]=function(arr);
            print(answer);
            //GfG obj=new GfG();
            //obj.find
            //System.out.println(obj.findMaxDiff(arr, arr.length));
        }
    }
    static void print(long []arr)
    {
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    static long[] function(long []arr)
    {
        Stack<Long> s=new Stack<Long>();
        long answer[]=new long[arr.length];
        
        for(int i=arr.length-1; i>=0; i--)
        {
            while((!s.isEmpty())&&(s.peek()<arr[i]))
            s.pop();

            if(s.size()==0)
            {
                answer[i]=-1;
                s.push(arr[i]);
            }
            else
            {
                answer[i]=s.peek();
                s.push(arr[i]);
            }
        }
        return answer;
    }
}
/*class GfG
    {
        int findMaxDiff(int a[], int n)
        {
        // Your code here	
        }
        long[] function(long []arr)
        {
            Stack<Long> s=new Stack<Long>();
            long answer[]=new long[arr.length];
            
            for(int i=arr.length-1; i>=0; i--)
            {
                while((!s.isEmpty())&&(s.peek()<arr[i]))
                s.pop();

                if(s.size()==0)
                {
                    answer[i]=-1;
                    s.push(arr[i]);
                }
                else
                {
                    answer[i]=s.peek();
                    s.push(arr[i]);
                }
            }
            return answer;
        }
    }*/