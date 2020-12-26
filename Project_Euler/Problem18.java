package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem18 
{
    static ArrayList<ArrayList<Long>> arr=new ArrayList<ArrayList<Long>>();
    static int limit=15;
    static long max_sum=0;
    static long matrix[][];
    public static void main(String []args)throws IOException
    {
        //BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader x=new BufferedReader(new FileReader("/home/dRazz3R/Documents/Code/personal/Project_Euler/input1.txt"));

        String filename="/home/dRazz3R/Documents/Code/personal/Project_Euler/input1.txt";
        FileWriter file = new FileWriter("/home/dRazz3R/Documents/Code/personal/Project_Euler/output1.txt");
        BufferedReader x=new BufferedReader(new FileReader(filename));

        matrix=new long[limit][limit];

        for(int i=1; i<=limit; i++)
        {
            //System.out.println(i);
            String input[]=(x.readLine()).trim().split(" ");
            ArrayList<Long> temp=new ArrayList<Long>();
            for(int j=0; j<i; j++)
            {
                long temp_no=Integer.parseInt(input[j]);
                temp.add(temp_no);
            }
            arr.add(temp);
        }
        convert_to_matrix();
        //print_matrix();
        //generate_sum();
        //generate_sum_1(arr.get(0).get(0),0,0);
        //System.out.println(max_sum);
        //System.out.println(generate_sum_2(0, 0));
        generate_sum_2();
    }
    static void convert_to_matrix()
    {
        for(int i=0; i<limit; i++)
        {
            for(int j=0; j<arr.get(i).size(); j++)
            {
                matrix[i][j]=arr.get(i).get(j);
            }
        }
    }
    static void print_matrix(long [][]m)
    {
        for(int i=0; i<limit; i++)
        {
            for(int j=0; j<limit; j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void generate_sum()
    {
        long sum=arr.get(0).get(0);
        int prev=0;
        System.out.print(sum);
        for(int i=1; i<limit; i++)
        {
            if(arr.get(i).get(prev)>arr.get(i).get(prev+1))
            {
                System.out.print("--->"+arr.get(i).get(prev));
                sum=sum+arr.get(i).get(prev);
            }
            else
            {
                System.out.print("--->"+arr.get(i).get(prev+1));
                sum=sum+arr.get(i).get(prev+1);
                prev=prev+1;
            }
        }
        System.out.println("\n"+sum);   
    }
    static void generate_sum_1(long s, int height, int index)
    {
        max_sum=Math.max(s, max_sum);
        if(height==arr.size()-1)
        {
            return;
        }
        generate_sum_1(s+arr.get(height+1).get(index), height+1, index);
        generate_sum_1(s+arr.get(height+1).get(index+1), height+1, index+1);
    }
    static long generate_sum_2(int height, int index)
    {
        if(height==limit)
        return 0;
        return arr.get(height).get(index)+Math.max(generate_sum_2(height+1, index), generate_sum_2(height+1, index+1));
    }
    static void generate_sum_2()
    {
        long sum[][]=new long[limit][limit];
        long ans=0;
        sum[0][0]=matrix[0][0];
        for(int i=1; i<limit; i++)
        {
            for(int j=0; j<=i; j++)
            {
                //System.out.println(i+","+j);
                sum[i][j]=Math.max(sum[i-1][j], sum[i-1][Math.max(j-1, 0)])+matrix[i][j];
                ans=Math.max(ans, sum[i][j]);
            }
        }
        //print_matrix(sum);
        System.out.println("Answer: "+ans);
    }
}
