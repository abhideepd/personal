package Prepbytes;
import java.io.*;
public class LUCKNUM {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(x.readLine());
        
        if(N%7==0)
        {
            print(0, N/7);
        }
        else if(N%11==0)
        print(N/11, N/11);
        else
        {
            int four=0, seven=0;
            for(int i=7; i<N; i=i+7)
            {
                int temp=N-i;
                if(temp%11==0)
                {
                    four=temp/11;
                    seven=temp/11+i/7;
                    break;
                }
            }
            if((four==0)&&(seven==0))
            {
                for(int i=4; i<N; i=i+4)
                {
                    int temp=N-i;
                    if(temp%11==0)
                    {
                        four=temp/11+i/4;
                        seven=temp/11;
                        break;
                    }
                }
                if((four==0)&&(seven==0))
                {
                    if(N%4==0)
                    print(N/4, 0);
                    else
                    System.out.print(-1);
                }
                else
                print(four, seven);
            }
            else
            print(four, seven);
        }
    }
    static void print(int four, int seven)
    {
        for(int i=0; i<four; i++)
        System.out.print(4);

        for(int i=0; i<seven; i++)
        System.out.print(7);
    }
}