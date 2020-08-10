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
            boolean visited[]=new boolean[size];
            int ans=-1, temp=0;
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
                if(visited[i]==false)
                ++temp;
                if(visited[arr[i]]==false)
                ++temp;
                if((visited[i]==true)||(visited[arr[i]]==true))
                {
                    if(ans<temp)
                    ans=temp;
                    temp=0;
                }
                visited[i]=true;
                visited[arr[i]]=true;
            }            
            System.out.println(ans);
        }
    }
}