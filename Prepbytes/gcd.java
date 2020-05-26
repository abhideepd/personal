    package Prepbytes;
    import java.io.*;
    import java.util.*;
    public class gcd {
        public static void main(String[] args)throws IOException {
            
            BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(xx.readLine());
            
            for(int i=0; i<t; i++)
            {
                String input[]=(xx.readLine()).split(" ");
                //int a=6;      
                long a=Long.parseLong(input[0]);
                //int b=9;
                long b=Long.parseLong(input[1]);
                long x=0;
//
                if(a!=b)
                    x=gcd(Math.max(a,b), Math.min(a,b));
                else
                    x=gcd(a, b);       
                long mul=a*b;
                long res=mul/x;
                System.out.println(res);
            }
        }
        static long gcd(long a, long b)
        {
            if(b%a==0)
                return a;
            return gcd(b%a, a);
        }
    }