package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class stack_sort {
    public static void main(String []args)throws IOException
    {
        //String input[]=("11 2 32 3 41").split(" ");
        //String input[]=("3 2 1").split(" ");
        //String input[]=("1 2 3").split(" ");
        //String input[]=("2 2").split(" ");
        //String input[]=("5 3 2 8 9 1 5").split(" ");
        //String input[]=("5 3 2 8 9 1 7").split(" ");
        String input[]=("2").split(" ");
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
        if(s.isEmpty())
        return sorted;

        if(flag==0)
        sorted.push(s.pop());

        flag=1;

        if(!s.isEmpty())
        {
            if(sorted.peek()<=s.peek())
            {
                sorted.push(s.pop());
            }
            else
            {
                int temp=s.pop();
                while(temp<sorted.peek())
                {
                    s.push(sorted.pop());

                    if(sorted.isEmpty())
                    break;
                }
                sorted.push(temp);
            }
        }

        return sort(s);
    }
}
