package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem42 
{
    static String names[];
    static int score[];
    static HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();;
    public static void main(String []args)throws IOException
    {
        String filename="/home/dRazz3R/Documents/Code/personal/Project_Euler/input2.txt";
        FileWriter file = new FileWriter("/home/dRazz3R/Documents/Code/personal/Project_Euler/output1.txt");
        BufferedReader x=new BufferedReader(new FileReader(filename));
        names=(x.readLine()).split(",");
        score=new int[names.length];
        temp_func();
        score_func();
        triangle();
        //testing();
        check();
    }
    static void check()
    {
        int ans=0;
        for(int i=0; i<names.length; i++)
        {
            if(hm.containsKey(score[i]))
            {
                System.out.println(names[i]);
                ++ans;
            }
        }
        System.out.println(ans);
    }
    static void triangle()
    {
        int k=2;
        int prev=1;
        for(int i=0; i<20; i++)
        {
            //System.out.print(prev+" ");
            hm.put(prev, 0);
            prev=prev+k++;
        }
    }
    static void testing()
    {
        for(int i=0; i<10; i++)
        System.out.println(names[i]+" "+score[i]);
        System.out.println("LAST:-"+names[names.length-1]);
        for(int i=0; i<names.length; i++)
        {
            if(names[i].equalsIgnoreCase("SKY"))
            {
                System.out.println(names[i]+" "+score[i]);
                break;
            }
        }
    }
    static void temp_func()
    {
        for(int i=0; i<names.length; i++)
        {
            names[i]=names[i].replace("\"", "");
            //names[i]
        }
    }
    static void score_func()
    {
        for(int i=0; i<names.length; i++)
        {
            for(int j=0; j<names[i].length(); j++)
            {
                //System.out.println(names[i]+" "+i+" "+j);
                score[i]=score[i]+(names[i].charAt(j)-'A'+1);
            }
        }
    }
}
