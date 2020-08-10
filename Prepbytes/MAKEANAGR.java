package Prepbytes;
import java.io.*;
public class MAKEANAGR {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T1=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T1; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            String S=input[0];
            String T=input[1];
            int visited[]=new int[26];
            
            for(int i=0; i<S.length(); i++)
            {
                //int temp=Integer.parseInt(S.charAt(i)+"");
                visited[S.charAt(i)-97]=visited[S.charAt(i)-97]+1;
            }
            for(int i=0; i<T.length(); i++)
            {
                //int temp=Integer.parseInt(T.charAt(i)+"");
                visited[T.charAt(i)-97]=visited[T.charAt(i)-97]-1;
            }
            int ans=0;
            for(int i=0; i<26; i++)
            {
                if(visited[i]>0)
                ans=ans+visited[i];
            }
            System.out.println(ans);
        }
    }
}