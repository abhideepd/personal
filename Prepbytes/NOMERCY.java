package Prepbytes;
import java.io.*;
public class NOMERCY {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            int r=Integer.parseInt(input1[0]);
            int c=Integer.parseInt(input1[1]);
            int ans=0, pos=-1;
            for(int i=0; i<r; i++)
            {
                String input[]=(x.readLine()).split(" ");
                int sum=0;
                for(int i2=0; i2<input.length; i2++)
                {
                    int temp=Integer.parseInt(input[i2]);
                    if(temp==1)
                    ++sum;
                }
                if(sum>ans)
                {
                    ans=sum;
                    pos=i;
                }
            }
            System.out.println(pos);
        }
    }
}