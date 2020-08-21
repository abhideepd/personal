package Prepbytes;
import java.io.*;
public class MINNUM {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(x.readLine());
        int cnt=0;
        while(N!=0)
        {
            ++cnt;
            N=N&(N-1);
        }
        System.out.println(cnt);
    }
}