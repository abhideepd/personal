package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class Stock_span_Single_Stack {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());

        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[size];

            for(int i=0; i<size; i++)
            arr[i]=Integer.parseInt(input[i]);

            int answer[]=new int[size];
            Stack<Integer> s=new Stack<Integer>();
            
            for(int i=0; i<size; i++)
            {
                while((!s.isEmpty())&&(arr[s.peek()]<=arr[i]))
                s.pop();

                if(s.isEmpty())
                answer[i]=i+1;
                else
                answer[i]=i-s.peek();
                s.push(i);
            }

            for(int i=0; i<size; i++)
            System.out.print(answer[i]+" ");

            System.out.println();
        }
    }
}
