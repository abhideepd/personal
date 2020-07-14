package Prepbytes;
import java.io.*;
public class MULNM {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int N=Integer.parseInt(input[0]);
            int M=Integer.parseInt(input[1]);
            int K=Integer.parseInt(input[2]);
            int result=K/(N*M);
            System.out.println(result);
        }
    }
}