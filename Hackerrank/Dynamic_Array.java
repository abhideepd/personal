package Hackerrank;
import java.io.*;
import java.util.*;
public class Dynamic_Array 
{
    public static void main(String []args)throws IOException   
    {
        testing1();
    } 
    static void testing1()throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String lengths[]=(x.readLine()).split(" ");
        int n=Integer.parseInt(lengths[0]);
        int q=Integer.parseInt(lengths[1]);
        List<List<Integer>> queries=new ArrayList<>();
        for(int i=0; i<q; i++)
        {
            String temp1[]=(x.readLine()).split(" ");
            List<Integer> temp2=new ArrayList<>();
            temp2.add(Integer.parseInt(temp1[0]));
            temp2.add(Integer.parseInt(temp1[1]));
            temp2.add(Integer.parseInt(temp1[2]));
            queries.add(temp2);
        }
        //System.out.println(queries);
        List<Integer> output=dynamicArray(n, queries);
        for(int i:output)
        System.out.println(i);
    }
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
            List<Integer> output=new ArrayList<>();
            List<List<Integer>> seqList=new ArrayList<>();
            int lastAnswer=0;

            //Initialization
            for(int i=0; i<n; i++)
            {
                List<Integer> temp=new ArrayList<>();
                seqList.add(temp);
            }

            for(int i=0; i<queries.size(); i++)
            {
                List<Integer> temp=queries.get(i);
                int x=temp.get(1);
                int y=temp.get(2);
                int index=(x^lastAnswer)%n;
                //System.out.println(temp.get(0));
                if (temp.get(0)==1)
                {
                    seqList.get(index).add(y);
                }
                else
                {
                    //System.out.println(y+" "+seqList.get(index)+" index:"+index);
                    lastAnswer=seqList.get(index).get(y%seqList.get(index).size());
                    //System.out.println("lastAnswer: "+lastAnswer);
                    output.add(lastAnswer);
                }
            }
            //System.out.println(seqList);
            return output;
        }    
}
