package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class stack_delete_middle {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //int t=Integer.parseInt(x.readLine());
        Stack<Integer> sa=new Stack<Integer>();

        for(int i=1; i<10; i++)
        sa.push(i);

        stack_delete_middle xyz= new stack_delete_middle();
        System.out.println(xyz.deleteMid(sa, sa.size(), 0));
    }
    public Stack<Integer> deleteMid(Stack<Integer>s,int sizeOfStack,int current)
    {
        //Your code here
        int cons=(sizeOfStack/2)-(1-(sizeOfStack%2));

        //if(current==sizeOfStack)
        //return s;
        if(s.size()==0)
        return s;

        int temp=s.pop();
        //System.out.println(s);
        Stack<Integer> temp_stack=deleteMid(s, sizeOfStack, current+1);
        //System.out.println(temp_stack);
        if(current!=cons)
        temp_stack.add(temp);

        return temp_stack;
    } 
}
