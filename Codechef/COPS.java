package Codechef;
import java.io.*;
import java.util.*;
public class COPS {
    public static void main(String []args)throws IOException
    {
            BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(xx.readLine());

            for(int i1=0; i1<t; i1++)
            {
                String input1[]=(xx.readLine()).split(" ");
                int M=Integer.parseInt(input1[0]);
                int x=Integer.parseInt(input1[1]);
                int y=Integer.parseInt(input1[2]);
                String input2[]=(xx.readLine()).split(" ");
                int arr[]=new int[M];

                int a=x*y;

                for(int i=0; i<M; i++)
                arr[i]=Integer.parseInt(input2[i]);

                boolean prev_high[]=new boolean[101];

                for(int i=0; i<M; i++)
                {
                    int low=Math.max(1, arr[i]-a);
                    int high=Math.min(100, arr[i]+a);
                    while(low<=high)
                    prev_high[low++]=true;
                }
                int ans=0;
                for(int i=1; i<=100; i++)
                {
                    //System.out.print(prev_high[i]+" ");
                    if(prev_high[i]==false)
                    ++ans;
                }

                System.out.println(ans);
        }
    }
}
