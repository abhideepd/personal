package Hackerrank;
import java.io.*;
import java.util.*; 
public class Balanced_Brackets 
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new  BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        String input="";
        while(t-->0)
        {input=x.readLine();
        System.out.println(isBalanced(input));}
    }   
    static String isBalanced(String s) 
    {
        Stack<Character> ss=new Stack<Character>();
        for(int i=0; i<s.length(); i++)
        {
            char temp=s.charAt(i);

            //  open bracket condition
            if((temp=='(')||(temp=='{')||(temp=='['))
            ss.push(temp);

            //  close bracket condition
            else
            {
                if(ss.size()==0)
                return "NO";

                else if(temp==')')
                {
                    if(ss.peek()!='(')
                    return "NO";
                }
                else if(temp==']')
                {
                    if(ss.peek()!='[')
                    return "NO";
                }
                else if(temp=='}')
                {
                    if(ss.peek()!='{')
                    return "NO";
                }
                ss.pop();
            }
        }
        if(ss.size()==0)
        return "YES";
        return "NO";
    } 
}
