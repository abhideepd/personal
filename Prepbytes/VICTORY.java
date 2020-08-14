package Prepbytes;
import java.io.*;
public class VICTORY {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int l=Integer.parseInt(input[0]);
            int r=Integer.parseInt(input[1]);
            int ans=0;

            for(int i=l; i>=1; i--)
            {
                if(check(i,l, r))
                {
                    ans=i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
    static boolean check(int a, int l, int r)
    {
        for(int i=l; i<=r; i++)
        {
            if(i%a!=0)
            return false;
        }
        return true;
    }
}