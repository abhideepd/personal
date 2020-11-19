package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class sort_by_frequency {
    public static void main(String[]args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=1;
        t=Integer.parseInt(x.readLine());        
        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");            
            driver(input);
            //test_inp();
        }
    }
    static void test_inp()
    {
        String input1[]=("5 5 4 6 4").split(" ");
        String input2[]=("9 9 9 2 5").split(" ");
        String input3[]=("").split(" ");
        String input4[]=("").split(" ");

        driver(input1);
        driver(input2);
        //driver(input3);
        //driver(input4);
    }
    static void driver(String []input)
    {
        TreeMap<Integer, Integer> tr=new TreeMap<Integer,Integer>();

        for(int i=0; i<input.length; i++)
        {
            int temp=Integer.parseInt(input[i]);

            if(!tr.containsKey(temp))
            tr.put(temp, 1);
            else
            tr.put(temp, tr.get(temp)+1);
        }

        TreeMap<Integer, TreeMap<Integer, Integer>> sort=new TreeMap<Integer, TreeMap<Integer, Integer>>();

        for(Map.Entry m:tr.entrySet())
        {
            int key=(int)m.getKey();
            int value=(int)m.getValue();

            if(sort.containsKey(value))
            {
                TreeMap<Integer, Integer> temp=sort.get(value);
                temp.put(key, 0);
                sort.put(value, temp);
            }
            else
            {
                TreeMap<Integer, Integer> temp=new TreeMap<Integer, Integer>();
                temp.put(key, 0);
                sort.put(value, temp);
            }
        }
        //System.out.println(tr+"\n"+sort);//--test
        //System.out.println();//--test

        //print
        StringBuilder output=new StringBuilder();
        for(Map.Entry m:sort.entrySet())
        {
            int repetation=(int)m.getKey();
            TreeMap<Integer, Integer> temp=sort.get(repetation);
            StringBuilder temp_1=new StringBuilder();

            for(Map.Entry m1:temp.entrySet())
            {
                int key=(int)m1.getKey();

                for(int i=0; i<repetation; i++)
                temp_1.append(key+" ");
            }
            temp_1.reverse();
            output.append(temp_1);
        }
        System.out.println(output.reverse());
    }
}