package Prepbytes;
import java.io.*;
import java.util.*;
public class BENCH {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String nk[]=(x.readLine()).split(" ");
            int N=Integer.parseInt(nk[0]);
            int K=Integer.parseInt(nk[1]);
            String input[]=(x.readLine()).split(" ");
            int ans=-1;
            //HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
            for(int i=0; i<N; i++)
            {
                int temp=Integer.parseInt(input[i]);
                if(temp==K)
                {
                    ans=i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}