package Prepbytes;
import java.io.*;
import java.util.*;
public class FIRNONRECHA {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine())+1;
            String input=x.readLine();
            input=input+'~';
            Queue<Character> q=new LinkedList<Character>();
            
            for(int i=0; i<size; i++)
            {
                char temp=input.charAt(i);                
                q.add(temp);
                if(q.size()!=0){
                    if(temp==q.peek())
                    q.add(q.remove());
                }
            }
            System.out.println(q);
            if(q.size()==0)
            System.out.println(-1);
            else
            System.out.println(q.peek());
        }
    }
}