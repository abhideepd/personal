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
        long r=Long.parseLong(x.readLine());

        //  --    RECIPEE
        long recipe_B=0, recipe_S=0, recipe_C=0;
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
        long price_B=0, price_S=0, price_C=0;
        price_B=Integer.parseInt(P_bsc[0]);
        price_S=Integer.parseInt(P_bsc[1]);
        price_C=Integer.parseInt(P_bsc[2]);

        price_B=recipe_B>0?price_B:0;
        price_S=recipe_S>0?price_S:0;
        price_C=recipe_C>0?price_C:0;

        //  --      INITIAL STOCK
        long n_B=0, n_S=0, n_C=0;
        n_B=Integer.parseInt(N_bsc[0]);
        n_S=Integer.parseInt(N_bsc[1]);
        n_C=Integer.parseInt(N_bsc[2]);

        long hamburger_price=(recipe_B*price_B)+(recipe_S*price_S)+(recipe_C*price_C);   //price of one hamburger

        long no_of_hamburgers=0;

        no_of_hamburgers=r/hamburger_price;

        long money_left=r%hamburger_price;

        long hamburgers_from_stock=0;

        if(recipe_B*recipe_S*recipe_C!=0L)
        hamburgers_from_stock=Math.min( n_B/recipe_B, Math.min(n_S/recipe_S, n_C/recipe_C));

        else if((recipe_B==0)&&(recipe_S==0))
        hamburgers_from_stock=(n_C/recipe_C);

        else if((recipe_B==0)&&(recipe_C==0))
        hamburgers_from_stock=(n_S/recipe_S);

        else if((recipe_C==0)&&(recipe_S==0))
        hamburgers_from_stock=(n_B/recipe_B);

        else if(recipe_B==0)
        hamburgers_from_stock=Math.min(n_S/recipe_S, n_C/recipe_C);

        else if(recipe_S==0)
        hamburgers_from_stock=Math.min( n_B/recipe_B, n_C/recipe_C);

        else if(recipe_C==0)
        hamburgers_from_stock=Math.min( n_B/recipe_B, n_C/recipe_C);

        //  --  STOCK LEFT
        n_B=n_B-(recipe_B*hamburgers_from_stock);
        n_S=n_S-(recipe_S*hamburgers_from_stock);
        n_C=n_C-(recipe_C*hamburgers_from_stock);

        no_of_hamburgers=no_of_hamburgers+hamburgers_from_stock;

        long consolidated_price=money_left+(n_B*price_B)+(n_C*price_C)+(n_S*price_S);

        no_of_hamburgers=no_of_hamburgers+(consolidated_price/hamburger_price);

        System.out.println(no_of_hamburgers);
    }
}
