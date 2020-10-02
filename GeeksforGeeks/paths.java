package GeeksforGeeks;
import java.util.*;
import java.lang.*;
import java.io.*;

public class paths {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());

        for(int i1=0; i1<t; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int M=Integer.parseInt(input[0]);
            int N=Integer.parseInt(input[1]);
            System.out.println(answer(M, N, 1, 1));
        }
    }
    static int answer(int M, int N, int i, int j)
    {
        if((i==0)||(j==0)||(i>M)||(j>N))
        return 0;

        if((i==M)&&(j==N))
        return 1;
        
        return answer(M, N, i+1, j)+answer(M, N, i, j+1);
    }
}