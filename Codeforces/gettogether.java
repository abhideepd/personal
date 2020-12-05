package Codeforces;
import java.io.*;
public class gettogether {
    static double xi[];
    static double vi[];
    static int n;
    static double final_min_range;
    static double final_max_range;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(x.readLine());

        xi=new double[n];
        vi=new double[n];

        double l=0, r=20000000000.0D;

        for(int i=0; i<n; i++)
        {
            String input[]=(x.readLine()).split(" ");
            xi[i]=Double.parseDouble(input[0]);
            vi[i]=Double.parseDouble(input[1]);
        }   

        /*
        while(l<=r)
        {
            int t=r-((r-l)/2);

            if(f(t)==1)
            r=t-1;
            else
            l=t+1;
        }
        */

        for(int i=0; i<100; i++)
        {
            double t=(l+r)/2.0D;

            if(f(t)==1)
            r=t;
            else
            l=t;
        }

        System.out.println(l);

        //print(l);
    }
    static int f(double t)
    {
        double min_range=-20000000000.0D, max_range=20000000000.0D;

        for(int i=0; i<n; i++)
        {
            double temp_min = xi[i] - ( t * vi[i] ) ;
            double temp_max = xi[i] + ( t * vi[i] ) ;

            min_range=Math.max(min_range, temp_min);
            max_range=Math.min(max_range, temp_max);
        }

        if((max_range-min_range)>=0)
        return 1;
        else
        return 0;
    }
}
