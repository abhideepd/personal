package GeeksforGeeks;
import java.util.*;
public class a {
    static Stack<Integer> s=new Stack<Integer>();
    public static void main(String []args)
    {
        
        for(int i=0; i<10; i++)
        s.add(i);
        System.out.println(s);
        reverse();
        System.out.println(s);
    }
    static void reverse()
    {
        if(s.isEmpty())
        return;
        int temp=s.pop();
        reverse();
        //reverse1(temp);
        System.out.print(temp+" ");
    }
    static void reverse1(int a)
    {
        if(s.isEmpty())
        s.push(a);
        else
        {
            int temp=s.pop();
            reverse1(a);
            s.push(temp);
        }
    }
}
