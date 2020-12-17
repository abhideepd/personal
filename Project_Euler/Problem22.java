package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem22 
{
    static String names[];
    
    public static void main(String []args)throws IOException
    {
        //testing();
        String filename="/home/dRazz3R/Documents/Code/personal/Project_Euler/input1.txt";
        FileWriter file = new FileWriter("/home/dRazz3R/Documents/Code/personal/Project_Euler/output1.txt");
        BufferedReader x=new BufferedReader(new FileReader(filename));
        names=(x.readLine()).split(",");
        Arrays.sort(names);
        //testing2();
        //for(String i:names)
        //file.write(i+"\n");
        //file.close();
        //System.out.println(names[0]+" "+names[1]+" "+names[2]+" "+names[3]+" "+names[4]+" "+names[5]+" "+names[6]+" "+names[7]+" "+names[8]);
        //System.out.println(names.length);
        long ans=0L;
        for(int i=0; i<names.length; i++)
        {
            long ii=i+1;
            //System.out.println()
            String name=names[i].replace("\"", "");
            long temp_cost=cost(name);
            long temp=temp_cost*(ii);
            file.write("Position:"+(i+1)+"  Name:"+name+"        Cost&Position:"+temp+"     Cost:"+temp_cost+"\n");
            ans=ans+temp;
        }
        file.close();
        System.out.println(ans);
    }
    static void testing2()
    {
        System.out.println(names[3]);
        System.exit(0);
    }
    static void testing()
    {
        //TAMELA
        System.out.println("COLIN "+cost("COLIN"));
        System.out.println("ZENOBIA "+cost("ZENOBIA"));
        System.out.println("ZULMA "+cost("ZULMA"));
        System.out.println("TAMELA "+cost("TAMELA"));
        System.exit(0);
    }
    static long cost(String a)
    {
        long ans=0;
        for(int i=0; i<a.length(); i++)
        {
            //int temp=(int)(a.charAt(i))-64;
            int temp=(a.charAt(i))-'A'+1;
            ans=ans+temp;
        }
        return ans;
    }
}
