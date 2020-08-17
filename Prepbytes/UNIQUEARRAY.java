package Prepbytes;
import java.io.*;
public class UNIQUEARRAY {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
            }
            int ans=1;
            boolean visited[]=new boolean[size];
            for(int i=0; i<size; i++)
            {
                int temp=i;
                int sum=0;
                while(visited[temp]!=true)
                {
                    visited[temp]=true;
                    temp=arr[temp];
                    ++sum;
                }
                if(sum>ans)
                ans=sum;
            }
            System.out.println(ans);
        }
    }
}