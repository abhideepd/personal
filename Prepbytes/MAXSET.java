package Prepbytes;
import java.io.*;
public class MAXSET {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int Q=Integer.parseInt(x.readLine());
        for(int i=0; i<Q; i++)
        {
            String input[]=(x.readLine()).split(" ");
            long L=Long.parseLong(input[0]);
            long R=Long.parseLong(input[1]);
            
            int R_Digit=(int)Math.ceil((Math.log10(R))/Math.log10(2));
            long a=(1<<R_Digit)-1;

            while(a>1)
            {
                if((a>=L)&&(a<=R))
                break;
                a=a>>1;
            }
            //int ans=(int)Math.ceil((Math.log10(R))/Math.log10(2));
            System.out.println(a);
        }
    }
}