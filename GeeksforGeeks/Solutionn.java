package GeeksforGeeks;
import java.util.*;
public class Solutionn
{
    public static void main(String []args)
    {
        String a="()(())(";
        System.out.println(findMaxLen(a));
    }
    static int findMaxLen(String S) {
        // code here
        Stack<Integer> stack=new Stack<Integer>();
        //int ans=0, max=-1;
        for(int i=0; i<S.length(); i++)
        {
            char temp=S.charAt(i);
            if(!stack.isEmpty())
            {
                if(temp=='(')
                stack.push(0);
                else
                {
                    if(stack.peek()!=-1)
                    stack.push(stack.pop()+2);
                    else
                    stack.push(-1);
                }
            }
            else
            {
                if(temp=='(')
                stack.push(0);
                else
                stack.push(-1);
            }
        }
        System.out.println(stack);
        int max=0, ans=0;
        while(!stack.isEmpty())
        {
            if(stack.peek()<=0)
            {
                if(max<ans)
                max=ans;
                ans=0;
                stack.pop();
            }
            else
            ans=ans+stack.pop();
        }
        return max;
    }
}