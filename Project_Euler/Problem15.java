package Project_Euler;
import java.io.*;
public class Problem15 
{
    static int ans=0;
    static int matrix[][];
    public static void main(String []args)
    {
        int a=20;
        matrix=new int[a][a]; 
        find_paths(0, 0, a+1);
        System.out.println(ans);
    }    
    static void find_paths(int l, int r, int limit)
    {
        /*if(matrix[l][r]==1)
        return;

        matrix[l][r]=1;*/

        //++ans;
        //System.out.println(l+" "+r+" "+ans);

        if((l==limit-1)&&(r==limit-1))
       {
           ++ans;
           return;
       }

        if((l+1)==limit)
        {
            find_paths(l, r+1, limit);
            return;
        }

        if((r+1)==limit)
        {
            find_paths(l+1, r, limit);
            return;
        }      
        find_paths(l+1, r, limit);
        find_paths(l, r+1, limit);
    }
}
