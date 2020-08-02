package Prepbytes;
import java.io.*;
public class PRAGYAGOMED {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i=0; i<T; i++)
        {
            String S1=x.readLine();
            String S2=x.readLine();
            System.out.println(ans(S1, S2, 0, 0));
        }
    }
    static int ans(String S1, String S2, int i1, int i2)
    {
        if(i1==S1.length())
        return 0;

        if(i2==S1.length())
        return 0;

        if((i1+i2)==(S1.length()+S2.length()))
        return 1;

        return i1;
    }
}