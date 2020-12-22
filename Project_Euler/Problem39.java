package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem39 
{
    static int matrix[][];
    public static void main(String []args)throws IOException
    {
        generate_dp_matrix();
        main_function();
        //testing1();
    }
    static int p_value(int perimeter)
    {
        int ans=0;
        for(int i=1; i<=1000; i++)
        {
            for(int j=1; j<=1000; j++)
            {
                {
                if(matrix[i][j]!=-1)
                    if( i + j + matrix[i][j] == perimeter )
                    ++ans;
                }
            }
        }
        return ans;
    }
    static void main_function()
    {
        int max=0;
        int ans=0;
        for(int p=1; p<=1000; p++)
        {
            int temp=p_value(p);
            if(temp>max)
            {
                //System.out.println("Choot");
                max=temp;
                ans=p;
            }
        }
        System.out.println(ans);
    }
    static void testing1()
    {
        System.out.println(p_value(120));
    }
    static void generate_dp_matrix()
    {
        matrix=new int[1001][1001];

        for(int i=1; i<=1000; i++)
        {
            for(int j=1; j<=1000; j++)
            {
                int temp=(i*i)+(j*j);
                int sq_root_temp=(int)Math.sqrt(temp);
                matrix[i][j]=check(temp, sq_root_temp);
            }
        }
    }
    static int check(int a, int sq_root_a)
    {
        if(sq_root_a*sq_root_a==a)
        return sq_root_a;
        return -1;
    }
}
