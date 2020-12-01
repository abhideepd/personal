package Codeforces;
import java.io.*;
public class prob19 {

    static int m, n;

    static int ti[];
    static int zi[];
    static int yi[];
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String inp1[]=(x.readLine()).split(" ");

        m=Integer.parseInt(inp1[0]);
        n=Integer.parseInt(inp1[1]);

        ti=new int[n];
        zi=new int[n];
        yi=new int[n];

        for(int i=0; i<n; i++)
        {
            String input[]=(x.readLine()).split(" ");
            ti[i]=Integer.parseInt(input[0]);
            zi[i]=Integer.parseInt(input[1]);
            yi[i]=Integer.parseInt(input[2]);
        }

        int l=1, r=3000000;

        while(l<=r)
        {
            int mid=r-((r-l)/2);

            if(f(mid)==1)
            r=mid-1;
            else
            l=mid+1;
        }

        if(m==0)
        print_exception();
        else
        print(l);
        ///*testing*/System.out.println(l);
    }
    static void print_exception()
    {
        System.out.println(0);
        System.out.println(0);
    }
    static void print(int x)
    {
        System.out.println(x);
        int ans=0;
        for(int i=0; i<n; i++)
        {
            int zi_work=zi[i]*ti[i]+yi[i];
            int work_rest_slots=x/zi_work;
            int rem=x%zi_work;
            int rem_work=0;

            if(rem>=ti[i]*zi[i])
            rem_work=zi[i];
            else
            rem_work=rem/ti[i];

            int total_balloons=work_rest_slots*zi[i]+rem_work;            
            
            ans=ans+total_balloons;

            if(ans>m)
            total_balloons=total_balloons-(ans-m);

            System.out.print(Math.max(0,total_balloons)+" ");
        }
    }
    static int f(int x)
    {
        long sum_total_balloons=0;
        for(int i=0; i<n; i++)
        {
            int zi_work=zi[i]*ti[i]+yi[i];
            int work_rest_slots=x/zi_work;
            int rem=x%zi_work;
            int rem_work=0;

            if(rem>=ti[i]*zi[i])
            rem_work=zi[i];
            else
            rem_work=rem/ti[i];

            int total_balloons=work_rest_slots*zi[i]+rem_work;

            sum_total_balloons=sum_total_balloons+total_balloons;
        }
        if(sum_total_balloons>=m)
        return 1;
        else
        return 0;
    }
}
