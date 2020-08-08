package Prepbytes;
import java.io.*;
public class MONK {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            int N=Integer.parseInt(input1[0]);
            int K=Integer.parseInt(input1[1]);
            String input[]=(x.readLine()).split(" ");
            K=K%N;
            for(int i=N-K; i<N; i++)
            System.out.print(input[i]+" ");
            for(int i=0; i<(N-K); i++)
            System.out.print(input[i]+" ");
            System.out.println();
        }
    }
}