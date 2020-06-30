package Prepbytes;
import java.io.*;
public class RMBNUM {
    public static void main(String[] args)throws IOException {
        
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //Enter TestCases
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            long r=Long.parseLong(input[0]);
            long p=Long.parseLong(input[1]);
            long q=Long.parseLong(input[2]);
            long res=0;
            long c=1;

            
            /*if(p%r==0)
            c=1;

            if(p<0)
            c=1;*/

            long a=(long)Math.ceil((double)p/(double)r);
            long b=(long)Math.ceil((double)q/(double)r);

            res=Math.abs(b-a);

            if(res>0)
            res=res+c;

            System.out.println("res: "+res);
        }
    }
}