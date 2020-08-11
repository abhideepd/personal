package Prepbytes;
import java.io.*;
import java.util.*;
public class MAJORITY1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
            for(int i=0; i<size; i++)
            {
                int temp=Integer.parseInt(input[i]);
                if(hm.containsKey(temp))
                {
                    hm.put(temp, hm.get(temp)+1);
                }
                else
                hm.put(temp, 1);
            }
            int ans=-1;
            for(Map.Entry en:hm.entrySet())
            {
                int key=(int)en.getKey();
                int value=hm.get(key);
                if(value>size/2)
                {
                    ans=key;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}