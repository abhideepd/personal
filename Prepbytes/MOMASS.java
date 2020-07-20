package Prepbytes;
import java.io.*;
import java.util.*;
public class MOMASS {
public static void main(String[] args)throws IOException {
    BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
    String input=x.readLine();
    Stack<Integer> s=new Stack<Integer>();
    Queue<String> q=new LinkedList<String>();

    for(int i=0; i<input.length(); i++)
    {
        q.add(input.charAt(i)+"");
    }

    while(!(q.isEmpty()))
    {
        String temp=q.peek();
        //System.out.println(s+" "+temp);
        if(temp.equals("C"))
        {
            s.push(12);
            q.remove();
        }
        else if(temp.equals("H"))
        {
            s.push(1);
            q.remove();
        }
        else if(temp.equals("O"))
        {
            s.push(16);
            q.remove();
        }        
        else if(temp.equals("("))
        {
            s.push(0);
            q.remove();
        }
        else if(temp.equals(")"))
        {
            int counter=1;
            int result=0;
            while(counter!=0)
            {
                int temp1=s.pop();
                if(temp1==0)
                break;
                result=result+temp1;
            }
            s.push(result);
            q.remove();
        }
        else{
            int r=0;
            while(!(q.isEmpty()))
            {
                if((temp.equals("C"))||(temp.equals("H"))||(temp.equals("O"))||(temp.equals("("))||(temp.equals(")"))){
                    break;
                }
                else{
                    int temp1=Integer.parseInt(q.remove());
                    r=r*10+temp1;
                }
                temp=q.peek();
            }            
            s.push(s.pop()*r);
        }
    }
    int result=0;
    //System.out.println(s);
    while(!(s.isEmpty()))
    {
        result=result+s.pop();
    }
    System.out.println(result);
}    
}