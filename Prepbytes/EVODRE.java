package Prepbytes;
import java.io.*;
public class EVODRE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i=0; i<T; i++)
        {
            int input=Integer.parseInt(x.readLine());
            System.out.println(func(input));
        }
    }
    static String func(int input)
    {
        if(input-2==0)
        return "2";
        if(input%2==0)
        return func(input-2)+" "+input;
        else
        return func(input-1);
    }
}