package Prepbytes;
import java.io.*;
import java.util.*;
public class MAP {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input1[]=(x.readLine()).split(" ");
            String input2[]=(x.readLine()).split(" ");
            int friend_position[]=new int[size];
            int shelter_position[]=new int[size];
            for(int i=0; i<size; i++)
            {
                friend_position[i]=Integer.parseInt(input1[i]);
                shelter_position[i]=Integer.parseInt(input2[i]);
            }
            Arrays.sort(friend_position);
            Arrays.sort(shelter_position);
            int diff[]=new int[size];
            for(int i=0; i<size; i++)
            {
                diff[i]=Math.abs(friend_position[i]-shelter_position[i]);
            }
            int max=Integer.MIN_VALUE;
            for(int i=0; i<size; i++)
            {
                if(max<diff[i])
                max=diff[i];
            }
            System.out.println(max);
        }
    }
}
