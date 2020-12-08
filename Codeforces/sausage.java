package Codeforces;
import java.io.*;
import java.util.*;
public class sausage {
    static long r;
    static long recipe_B=0, recipe_S=0, recipe_C=0;
    static long price_B=0, price_S=0, price_C=0;
    static long n_B=0, n_S=0, n_C=0;
    static long hamburger_price=0;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String recipe=x.readLine();
        String N_bsc[]=(x.readLine()).split(" ");
        String P_bsc[]=(x.readLine()).split(" ");
        r=Long.parseLong(x.readLine());

        //  --    RECIPEE
        //long recipe_B=0, recipe_S=0, recipe_C=0;
        for(int i=0; i<recipe.length(); i++)
        {
            if(recipe.charAt(i)=='B')
            ++recipe_B;

            if(recipe.charAt(i)=='S')
            ++recipe_S;
            
            if(recipe.charAt(i)=='C')
            ++recipe_C;
        }
        
        //  --     PRICE
        //long price_B=0, price_S=0, price_C=0;
        price_B=Integer.parseInt(P_bsc[0]);
        price_S=Integer.parseInt(P_bsc[1]);
        price_C=Integer.parseInt(P_bsc[2]);

        price_B=recipe_B>0?price_B:0;
        price_S=recipe_S>0?price_S:0;
        price_C=recipe_C>0?price_C:0;

        //  --      INITIAL STOCK
        //long n_B=0, n_S=0, n_C=0;
        n_B=Integer.parseInt(N_bsc[0]);
        n_S=Integer.parseInt(N_bsc[1]);
        n_C=Integer.parseInt(N_bsc[2]);

        hamburger_price=(recipe_B*price_B)+(recipe_S*price_S)+(recipe_C*price_C);   //price of one hamburger

        long l=0, r=100000000000000L;

        while(l<=r)
        {
            long m=(l+r)/2L;
            if(f(m)==1)
            l=m+1;
            else
            r=m-1;
        }
        System.out.println(l-1);
    }
    static int f(long x)
    {
        long y = ( (Math.max(0, ((x*recipe_B)-n_B))) * price_B ) + ( (Math.max(0, ((x*recipe_S)-n_S))) * price_S ) + ( (Math.max(0, ((x*recipe_C)-n_C))) * price_C );

        if(y>r)
        return 0;
        else
        return 1;
    }
}
