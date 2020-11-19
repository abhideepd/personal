package Codeforces;
import java.io.*;
public class prob5 {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());

        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String candy_inp[]=(x.readLine()).split(" ");
            String orange_inp[]=(x.readLine()).split(" ");
            int candy[]=new int[size];
            int orange[]=new int[size];

            int min_candy=Integer.MAX_VALUE;
            int min_orange=Integer.MAX_VALUE;

            for(int i=0; i<size; i++)
            {
                int temp=Integer.parseInt(candy_inp[i]);
                candy[i]=temp;
                min_candy=Math.min(temp, min_candy);
            }

            for(int i=0; i<size; i++)
            {
                int temp=Integer.parseInt(orange_inp[i]);
                orange[i]=temp;
                min_orange=Math.min(temp, min_orange);
            }

            long answer=0;
            for(int i=0; i<size; i++)
            {
                int temp=Math.max(candy[i]-min_candy, orange[i]-min_orange);
                //System.out.println(temp);
                answer=answer+temp;
            }
            //System.out.print("Answer: ");
            System.out.println(answer);
        }
    }
}
