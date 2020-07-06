package Prepbytes;
import java.io.*;
import java.util.*;
public class MAXDIV {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        int a=Integer.parseInt(input1[0]);
        int b=Integer.parseInt(input1[1]);
        ArrayList<Integer> fact=new ArrayList<Integer>();
        for(int i=1; i<a; i++)
        {
            if((a%i==0)&&(b%i==0))
            {
                fact.add(i);
            }
        }
        int q=Integer.parseInt(x.readLine());
        for(int i=0; i<q; i++)
        {
            String input2[]=(x.readLine()).split(" ");
            int low=Integer.parseInt(input2[0]);
            int high=Integer.parseInt(input2[1]);

            //System.out.println("Answer: ");
            
            if(fact.get(0)>low)
            {
                System.out.println(-1);
            }
            else if(fact.get(fact.size()-1)<low)
            {
                System.out.println(-1);
            }
            else{
                for(int i1=fact.size()-1; i1>=0; i1--)
                {
                    int temp=fact.get(i1);
                    if((temp>=low)&&(temp<=high))
                    {
                        System.out.println(temp);
                        break;
                    }
                }
            }
        }
    }
}