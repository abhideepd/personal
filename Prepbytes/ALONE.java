package Prepbytes;
import java.io.*;
public class ALONE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int a=0;
            for(int i=0; i<size; i++)
            {
                int temp=Integer.parseInt(input[i]);
                a=a^temp;
            }
            System.out.println(a);
        }
    }
}