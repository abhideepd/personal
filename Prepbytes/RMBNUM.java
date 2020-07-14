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
            long result=0;
            
            if((p<=0)&&(q>=0))
            {
                result=(q/r)-(p/r)+1;
            }
            else if((p>0)&&(q>0))
            {
                if(p%r==0)
                result=(q/r)-(p/r)+1;
                else
                result=(q/r)-(p/r);
            }
            else{
                long temp1=Math.abs(p);
                long temp2=Math.abs(q);
                p=temp2;
                q=temp1;
                if(p%r==0)
                result=(q/r)-(p/r)+1;
                else
                result=(q/r)-(p/r);
            }
            System.out.println(Math.abs(result));
        }
    }
}