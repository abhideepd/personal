package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class max_sub_array {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());

        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=x.readLine().split(" ");
            Stack<Integer> s=new Stack<Integer>();
            for(int i=0; i<input.length; i++)
            s.push(Integer.parseInt(input[i]));
            int max=Integer.MIN_VALUE;
            while(s.size()>1)
            {
                int a=s.pop();
                int b=s.peek();
                if(max<a+b)
                max=a+b;
            }
            System.out.println(max);
        }
    }
}
