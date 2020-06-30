package Prepbytes;
import java.io.*;
public class OPTNUM {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //Input no. of testcases
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int a=Integer.parseInt(input[0]);
            int b=Integer.parseInt(input[1]);

            int res=0;
            int flag=1;

            while(flag==1)
            {
                res=res+(b/a);
                int temp=b%a;

                if(temp==0)
                {
                    flag=0;
                }

                b=a;
                a=temp;
            }

            System.out.println(res);
        }
    }
}