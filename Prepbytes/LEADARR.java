package Prepbytes;
import java.io.*;
public class LEADARR {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int prev=-1;
            for(int i=size-1; i>=0; i--)
            {
                int temp=Integer.parseInt(input[i]);
                if(temp>=prev)
                {
                    System.out.print(temp+" ");
                    prev=temp;
                }
            }
            System.out.println();
        }
    }
}