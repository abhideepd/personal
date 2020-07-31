package Prepbytes;
import java.io.*;
public class PATRN {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i=0; i<T; i++)
        {
            int input=Integer.parseInt(x.readLine());
            System.out.print(input+" ");
            answer(input, input-5);
        }
    }
    static void answer(int a, int b)
    {
        System.out.print(b+" ");

        if(b==a)
        return;

        if(b>0)
        answer(a, b-5);

        else if(b<=0)
        answer(a, b+5);
    }
}