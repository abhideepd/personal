package Prepbytes;
import java.io.*;
public class DATEGAME {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        String DM[]=(x.readLine()).split(" ");
        int D=Integer.parseInt(DM[0]);
        int M=Integer.parseInt(DM[1]);//length of segment
        int ans=0;
        for(int i=0; i<(size-M+1); i++)
        {
            int r=i+M;
            int sum=0;
            for(int i1=i; i1<r; i1++)
            {
                sum=sum+Integer.parseInt(input[i1]);
            }
            if(sum==D)
            {
                i=r-1;
                ++ans;
            }
        }
        System.out.println(ans);
    }
}