package Codeforces.Contests.Round674;
import java.io.*;
import java.util.*;
public class D {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        int n=size;
        long large_number=(long)Math.pow(10, 10);
        String input[]=(x.readLine()).split(" ");

        ArrayList<Long> arr=new ArrayList<Long>();

        //for(int i=0; i<size; i++)
        //arr.add(Long.parseLong(input[i]));

        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ///a[i]=input.nextInt();
            a[i]=Integer.parseInt(input[i]);
        }

        int ans=0;

        int count=0;
        HashSet<Long> set=new HashSet<>();
        set.add(0L);
        long sum=0;
        for(int i=0;i<n;i++)
        {
            //System.out.println(a[i]+" "+set);
            sum+=a[i];
            if(set.contains(sum) || sum==0)
            {
                System.out.println(sum+" "+a[i]+" "+set);
                count++;
                set=new HashSet<>();
                sum=a[i];
                set.add(sum);
            }
            else
            {
                set.add(sum);
            }
        }
        System.out.println(count);
        //System.out.println(ans);
    }
}
