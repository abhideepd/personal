package Hackerrank;
import java.io.*;
import java.util.*;
public class queue_two_stacks 
{
    static Stack<Integer> helper_stack=new Stack<Integer>();
    static Stack<Integer> main_stack=new Stack<Integer>();
    static int queue_head=0;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());   
        while(t-->0)
        {
            String input[]=(x.readLine()).split(" ");
            int type=Integer.parseInt(input[0]);
            if(type==1)
            {
                int element=Integer.parseInt(input[1]);
                enqueue(element);
            }
            else if(type==2)
            {
                dequeue();
            }
            else if(type==3)
            {
                print();
            }
        }
    }
    static void enqueue(int x)
    {
        helper_stack.push(x);
    }
    static void dequeue()
    {
        if(main_stack.size()==0)while(helper_stack.size()!=0)main_stack.push(helper_stack.pop());
        main_stack.pop();
    }
    static void print()
    {
        if(main_stack.size()==0)while(helper_stack.size()!=0)main_stack.push(helper_stack.pop());
        System.out.print("Answer: ");  
        System.out.println(main_stack.peek());     
    }
}
