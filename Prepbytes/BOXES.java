package Prepbytes;
import java.io.*;
public class BOXES {
    public static void main(String[] args)throws IOException {
        BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
        int q=Integer.parseInt(x.readLine());
        for(int i=0; i<q; i++)
        {
            String input[]=(x.readLine()).split(" ");
            int A=Integer.parseInt(input[0]);
            int B=Integer.parseInt(input[1]);
            int C=Integer.parseInt(input[2]);

            if((C<A)&&(C<B))
            System.out.println((A+B+C)/3);

            else if((C==A)||(C==B))
            System.out.println(A<=B?A:B);

            else
            {
                if(A<B)
                System.out.println(A);

                else if(B<A)
                System.out.println(B);

                else
                System.out.println(A);
            }
        }
    }
}