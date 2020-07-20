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
            int result=K/LCM(N,M);
            System.out.println(result);
        }
    }
    static int LCM(int M, int N)
    {
        int result=0;
        if(M<=N)
        {
            result=M*N/GCD(M,N);
        }
        else{
            result=M*N/GCD(N,M);
        }
        return result;
    }
    static int GCD(int M, int N)
    {
        if(M==0)
        return N;
        return GCD(N%M, M);
    }
}