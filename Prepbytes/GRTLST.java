package Prepbytes;
import java.io.*;
import java.time.Year;
import java.util.*;
public class GRTLST {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            long M=Long.parseLong(x.readLine());
            if(check(M))
            System.out.println(M);
            else{
                System.out.println(ans(M));
            }
        }
    }
    static long ans(long M)
    {
        long before=M;
        long prev=before%10;
        before=before/10;
        long present=0;
        long after=prev;
        long p=10;
        while(before!=0)
        {
            present=before%10;
            before=before/10;
            if(present<prev)
            {
                break;
            }
            after=p*present+after;
            p=p*10;
            prev=present;
        }
        //System.out.println(before+" "+present+" "+after);
        long after_after=0;
        long p1=1;
        long digit=0;
        while(after!=0)
        {
            long temp=after%10;
            after=after/10;
            
            if(temp>present)
            {
                if(temp==(after%10))
                {
                    after_after=temp*p1+after_after;
                    p1=p1*10;
                    continue;
                }
                
                digit=temp;
                //System.out.println(temp+" "+after+" "+after_after);
                break;
            }
            after_after=temp*p1+after_after;
            p1=p1*10;
        }
        long ans1=before*10+digit;
        long ans2=after*10+present;
        ans2=ans2*p1+after_after;
        long finalee=ans1*p+ans2;
        String finale=ans1+"-"+ans2;
        //System.out.println(finalee);
        return finalee;
    }
    static boolean check(long M)
    {
        //Assending order check;
        long prev=M%10;
        M=M/10;
        while(M!=0)
        {
            long temp=M%10;
            if(temp<prev)
            return false;
            prev=temp;
            M=M/10;
        }
        return true;
    }
}