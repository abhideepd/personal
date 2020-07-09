package Prepbytes;
import java.io.*;
public class FLPK {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        int N=Integer.parseInt(input1[0]);
        int k=Integer.parseInt(input1[1]);
        
        for(int i1=0; i1<N; i1++)
        {
            int roll=Integer.parseInt(x.readLine());
            int a=(int)Math.log10(roll);
            int power=(int)Math.pow(10, a);
            int first=roll/power;
            int last=roll%10;
            int sum=first+last;
            if(pachu(first, last, k)!=-1)
            System.out.println("Yes");
            else
            System.out.println("No");
        }      
    }
    static int pachu(int first, int last, int k)
    {
        if((first==2)||(first==3)||(first==5)||(first==7))
        {
            if((last==2)||(last==3)||(last==5)||(last==7))
            {
                if((first+last)>k)
                return 0;
            }
        }
        return -1;
    }
}