package Prepbytes;
import java.io.*;
public class PATRN {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i=0; i<T; i++)
        {
            int input=Integer.parseInt(x.readLine());
            if(input==0)
            System.out.print(0);
            else
            answer(input, input, 0);
            System.out.println();
        }
    }
    static void answer(int a, int b, int count)
    {
        System.out.print(b+" ");

        if(b>0)
        {
            if(count==0)
            answer(a, b-5, count);

            else if(b==a)
            return;

            else
            answer(a, b+5, 1);    
        }
        else
        answer(a, b+5, 1);
    }
}