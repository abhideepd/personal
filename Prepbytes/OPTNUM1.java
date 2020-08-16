package Prepbytes;
import java.io.*;
public class OPTNUM1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            long p=Long.parseLong(input[0]);
            long q=Long.parseLong(input[1]);
            if(p==q)
            System.out.println(0);
            else if(q/p==1)
            {
                q=q-p;
                System.out.println((p/q)+(p%q));
            }
            else{
                System.out.println((q/p)+(q%p));
            }
        }
    }
}