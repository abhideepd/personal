package Prepbytes;
import java.io.*;
import java.util.*;
public class STNNUM {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int N=Integer.parseInt(x.readLine());
            Queue<Integer> line=new LinkedList<Integer>();
            for(int i=1; i<=N; i++)
            line.add(i);
            
            while(line.size()!=1)
            {
                line.add(line.remove());
                line.remove();
            }
            System.out.println(line.peek());
        }
    }
}