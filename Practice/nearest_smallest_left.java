package Practice;
import java.io.*;
import java.util.*;
public class nearest_smallest_left 
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        int inp_arr[]=new int[input.length];
        int ans_arr[]=new int[input.length];
        for(int i=0; i<input.length; i++)
        inp_arr[i]=Integer.parseInt(input[i]);
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0; i<input.length; i++)
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
        System.out.print("\nAnswer: ");print(ans_arr);
    }
    static void print(int []a)
    {
        for(int i:a)
        System.out.print(i+" ");
    }
}
