package Prepbytes;
import java.io.*;
import java.util.*;
public class CNTTIM {
 public static void main(String[] args)throws IOException {
     BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
     int size=Integer.parseInt(x.readLine());
    String Ravi[]=(x.readLine()).split(" ");
    String Salma[]=(x.readLine()).split(" ");
    Queue<String> q_Ravi=new LinkedList<String>();  
    Queue<String> q_Salma=new LinkedList<String>();
    for(int i=0; i<size; i++)
    {
        q_Ravi.add(Ravi[i]);
        q_Salma.add(Salma[i]);
    }
    int ans=0;
    while(q_Salma.size()!=0)
    {
        ++ans;
        if(q_Ravi.peek().equals(q_Salma.peek()))
        {
            q_Ravi.remove();
            q_Salma.remove();
        }
        else
        q_Ravi.add(q_Ravi.remove());
    }
    System.out.println(ans);
 }   
}