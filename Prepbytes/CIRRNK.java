package Prepbytes;
import java.io.*;
public class CIRRNK {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i=0; i<T; i++)
        {
            String input[]=(x.readLine()).split(" ");
            int V=Integer.parseInt(input[0])-1;
            int E=Integer.parseInt(input[1]);
            System.out.println(E-V);
        }
    }
}
