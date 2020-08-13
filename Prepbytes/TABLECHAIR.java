package Prepbytes;
import java.io.*;
public class TABLECHAIR {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int M=Integer.parseInt(input[0]);
            int R1=Integer.parseInt(input[1]);
            int R2=Integer.parseInt(input[2]);
            int R3=Integer.parseInt(input[3]);

            if(M%4==0)
            System.out.println(0);
            else if((M+1)%4==0)
            {
                System.out.println(R1);
            }
            else if((M+2)%4==0)
            {
                if(R1*2<=R2)
                System.out.println(R1*2);
                else
                System.out.println(R2);
            }
            else{
                int sum_111=R1*3;
                int sum_21=R2+R1;
                int sum_3=R3;
                if((sum_111<=sum_21)&&(sum_111<=3))
                System.out.println(sum_111);
                else if(sum_21<=sum_3)
                System.out.println(sum_21);
                else
                System.out.println(sum_3);
            }
        }
    }
}