package Prepbytes;
import java.io.*;
public class GEMWAR {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        long N=Long.parseLong(input[0]);//warriors
        long M=Long.parseLong(input[1]);//gems
        long X=Long.parseLong(input[2]);
        long Y=Long.parseLong(input[3]);
        
        System.out.println(func1(N, X, Y, M));
    }
    static long func1(long N, long X, long Y, long M)
    {
        long result=M/X;
        if(result>N)
        return N;
        M=M%X;
        N=N-result;
        result=result+((M+(N*Y))/(X+Y));
        return result;
    }
}