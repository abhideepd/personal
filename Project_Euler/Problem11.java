package Project_Euler;
import java.util.*;
import java.io.*;
public class Problem11
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int arr[][]=new int[20][20];
        int rev_arr[][]=new int[20][20];

        //--    Input
        for(int i=0; i<20; i++)
        {
            String input[]=(x.readLine()).split(" ");
            for(int j=0; j<20; j++)
            {
                int temp=Integer.parseInt(input[j]);
                arr[i][j]=temp;
                rev_arr[19-i][19-j]=temp;
            }
        }
        int dist=4;
        long prod=1L;
        //Right Diognal
        for(int i=0; i<20-dist; i++)
        {
            for(int j=0; j<20-dist; j++)
            {
                long curr_prod=1L;
                for(int k=0; k<dist; k++)
                {
                    curr_prod=curr_prod*arr[i+k][j+k];
                }
                prod=Math.max(prod, curr_prod);
            }
        }
        //horizontal
        for(int i=0; i<20; i++)
        {
            for(int j=0; j<20-dist; j++)
            {
                long curr_prod=1L;
                for(int k=0; k<dist; k++)
                {
                    curr_prod=curr_prod*arr[i][j+k];
                }
                prod=Math.max(prod, curr_prod);
            }
        }
        //Vertical
        for(int i=0; i<20-dist; i++)
        {
            for(int j=0; j<20; j++)
            {
                long curr_prod=1L;
                for(int k=0; k<dist; k++)
                {
                    curr_prod=curr_prod*arr[i+k][j];
                }
                prod=Math.max(prod, curr_prod);
            }
        }
        //Left Diognal
        for(int i=0; i<20-dist; i++)
        {
            for(int j=dist-1; j<20; j++)
            {
                long curr_prod=1L;
                for(int k=0; k<dist; k++)
                {
                    curr_prod=curr_prod*rev_arr[i+k][j-k];
                }
                prod=Math.max(prod, curr_prod);
            }
        }
        System.out.print(prod);
    }
    static void print(int [][]arr)
    {
        System.out.println("OUTPUT");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
