package Practice;
import java.util.*;
import java.io.*;
public class test1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
        String input[]=(x.readLine()).split(" ");

        for(int i=0; i<input.length; i++)
        {
            int temp=Integer.parseInt(input[i]);

            if(hm.containsKey(temp))
            {
                hm.put(temp, hm.get(temp)+1);
            }
            else
            hm.put(temp, 1);
        }
        System.out.println(hm);
    }
}