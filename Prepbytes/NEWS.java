package Prepbytes;
import java.io.*;
import java.util.*;
public class NEWS {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        while(T-->0)
        {
            TreeMap<Integer, String> local=new TreeMap<Integer, String>();
            TreeMap<Integer, String> glocal=new TreeMap<Integer, String>();
            int size=Integer.parseInt(x.readLine());
            for(int i=0; i<size; i++)
            {
                String input[]=(x.readLine()).split(" ");
                String C=input[0];
                int P=Integer.parseInt(input[1]);
                int D=Integer.parseInt(input[2]);
                if(D==1)
                {
                    local.put(P, C);
                }
                else{
                    glocal.put(P, C);
                }
            }
            Stack<String> output=new Stack<String>();
            for(Map.Entry e:glocal.entrySet())
            {
                output.push((String)e.getValue());
            }
            for(Map.Entry e:local.entrySet())
            {
                output.push((String)e.getValue());
            }
            while(!(output.isEmpty()))
            {
                System.out.println(output.pop());
            }
        }
    }
}