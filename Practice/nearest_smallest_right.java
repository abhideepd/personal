package Practice;
import java.io.*;
import java.util.*;
public class nearest_smallest_right 
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String inp[]=(x.readLine()).split(" ");
        int inp_arr[]=new int[inp.length];
        for(int i=0; i<inp.length; i++)
        {
            inp_arr[i]=Integer.parseInt(inp[i]);
        }
        int ans_arr[]=new int[inp.length];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=inp.length-1; i>=0; i--)
        {
            while((s.size()!=0)&&(s.peek()>=inp_arr[i]))
            s.pop();

            if(s.size()==0)
            ans_arr[i]=inp_arr[i];
            else
            ans_arr[i]=s.peek();
            s.push(inp_arr[i]);
        }
        System.out.print("\nInput : ");print(inp_arr);
        System.out.print("\nOutput: ");print(ans_arr);
    }
    static void print(int []a)
    {
        for(int i:a)
        System.out.print(i+" ");
    }
}
