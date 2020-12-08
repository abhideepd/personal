    package Codeforces;
    import java.io.*;
    public class k_segment {
        static int n;
        static int k;
        static int l_arr[];
        static int r_arr[];
        public static void main(String []args)throws IOException
        {
            BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
            String n_k[]=(x.readLine()).split(" ");
            n=Integer.parseInt(n_k[0]);
            k=Integer.parseInt(n_k[1]);
            l_arr=new int[n];
            r_arr=new int[n];

            for(int i=0; i<n; i++)
            {
                String input[]=(x.readLine()).split(" ");
                l_arr[i]=Integer.parseInt(input[0]);
                r_arr[i]=Integer.parseInt(input[1]);
            }

            long l=Integer.MIN_VALUE, r=Integer.MAX_VALUE;

            while(l<=r)
            {
                long m=(l+r)/2;
                if(f(m)==1)
                l=m+1;
                else
                r=m-1;
            }
            System.out.println(l-1);
        }
        public static int f(long x)
        {
            long ans=0;
            for(int i=0; i<n; i++)
            {
                int l=l_arr[i];
                int r=r_arr[i];

                if(l>=x)
                {}
                else if(x>=r)
                ans=ans+(r-l)+1;
                else
                ans=ans+(x-l)   ;
                //ans=ans+Math.min(x-l, r-l+1);
            }
            if(ans<=k)
            return 1;
            else 
            return 0;
        }
    }
