package GeeksforGeeks;
import java.util.*;
public class infix_to_postfix {
    public static void main(String []args)
    {
        String infix="(A+B/C*(D+E)-F)";
        String postfix="";
        Stack<Character> s=new Stack<Character>();
        for(int i=0; i<infix.length(); i++)
        {
            char temp=infix.charAt(i);
            if((temp!='(')&&(temp!=')')&&(temp!='+')&&(temp!='-')&&(temp!='*')&&(temp!='/'))
            {
                postfix=postfix+temp;
            }
            else
            {
                
            }
        }
    }
}
