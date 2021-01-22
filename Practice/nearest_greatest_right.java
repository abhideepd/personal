package Practice;
import java.io.*;
import java.util.*;
public class nearest_greatest_right 
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        int []arr=new int[input.length];
        for(int i=0; i<input.length; i++)
        {
            arr[i]=(Integer.parseInt(input[i]));
        }
        Stack<Integer> s=new Stack<Integer>();
        int ans[]=new int[input.length];
        for(int i=arr.length-1; i>=0; i--)
        {
            while((s.size()!=0)&&(s.peek()<=arr[i]))
            s.pop();
            if(s.size()==0)
            ans[i]=arr[i];
            else
            ans[i]=s.peek();
            s.push(arr[i]);
        }
        System.out.print("\nInput : "); print(arr);
        System.out.print("\nAnswer: "); print(ans);
    }
    static void print(int []a)
    {
        for(int i=0; i<a.length; i++)
        System.out.print(a[i]+" ");
    }
}
