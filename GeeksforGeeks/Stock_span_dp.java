package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class Stock_span_dp {
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

            for(int i=0; i<size; i++)
            {
                int prev=i-1, ans=0;

                while((prev>=0)&&(arr[prev]<=arr[i]))
                {
                    ans=ans+1+answer[prev];
                    prev=prev-1-answer[prev];
                }
                answer[i]=ans;
            }

            for(int i=0; i<size; i++)
            System.out.print(answer[i]+1+" ");

            System.out.println();
        }
    }
}
