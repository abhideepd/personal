package Prepbytes;
import java.io.*;
import java.util.*;
public class RVRSEQU {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            Queue<Integer> a=new LinkedList<Integer>();
            Queue<Integer> b=new LinkedList<Integer>();
            for(int i=0; i<input.length; i++)
            {
                a.add(Integer.parseInt(input[i]));
            }
            while(a.size()!=0)
            {
                int K=0;
                while(K!=(a.size()-1))
                {
                    a.add(a.remove());
                    K++;
                }
                b.add(a.remove());
            }
            while(b.size()!=0)
            System.out.print(b.remove()+" ");
            System.out.println();
        }
    }
}