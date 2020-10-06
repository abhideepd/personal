package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class stack_sort {
    public static void main(String []args)throws IOException
    {
        //String input[]=("11 2 32 3 41").split(" ");
        String input[]=("3 2 1").split(" ");
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0; i<input.length; i++)
        {
            int temp=Integer.parseInt(input[i]);
            s.push(temp);
        }
        stack_sort obj=new stack_sort();
        System.out.println("orignal: "+s);
        System.out.println(obj.sort(s));
    }
    static Stack<Integer> sorted=new Stack<Integer>();
    static int flag=0;
    
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(flag==0)
		sorted.push(s.pop());
		
		flag=1;
		
		/*if(s.size()==1)
		{
		    sorted.push(s.pop());
		    return sorted;
		}*/
		
		if(s.size()==0)
		{
		    return sorted;
		}
		
        int a=s.peek();		
        
        int b=sorted.peek();
		
		if(a<=b)
		{
            sorted.push(a);
            s.pop();
		}
		else
		{
            int temp=s.pop();
                b=sorted.pop();
            while((b<a)&&(!sorted.isEmpty()))
            {
                //if(temp>b)
                s.push(b);
                b=sorted.pop();
            }
            if(!sorted.isEmpty())
            sorted.push(b);
            sorted.push(temp);
        }
        //System.out.println(s+"       "+sorted);
		return sort(s);
    }
}
