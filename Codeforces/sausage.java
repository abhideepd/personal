package Codeforces;
import java.io.*;
import java.util.*;
public class sausage {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String recipe=x.readLine();
        String N_bsc[]=(x.readLine()).split(" ");
        String P_bsc[]=(x.readLine()).split(" ");
        int r=Integer.parseInt(x.readLine());

        //  --    RECIPEE
        int recipe_B=0, recipe_S=0, recipe_C=0;
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
        int price_B=0, price_S=0, price_C=0;
        price_B=Integer.parseInt(P_bsc[0]);
        price_S=Integer.parseInt(P_bsc[1]);
        price_C=Integer.parseInt(P_bsc[2]);

        //  --      INITIAL STOCK
        int n_B=0, n_S=0, n_C=0;
        n_B=Integer.parseInt(N_bsc[0]);
        n_S=Integer.parseInt(N_bsc[1]);
        n_C=Integer.parseInt(N_bsc[2]);

        int hamburger_price=(recipe_B*price_B)+(recipe_S*price_S)+(recipe_C*price_C);
        
    }
}
