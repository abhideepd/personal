package Prepbytes;
import java.io.*;
import java.util.*;
public class KEYROTATE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int search=Integer.parseInt(x.readLine());
            int result=-1;
            //HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
            for(int i=0; i<size; i++)
            {
                int temp=Integer.parseInt(input[i]);
                /*if(!(hm.containsKey(temp)))
                hm.put(temp, i);*/
                if(temp==search)
                {result=i; break;}
            }
            System.out.println(result);
        }
    }
}