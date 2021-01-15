package Hackerrank;
import java.io.*;
import java.util.*;
public class Simple_Text_Editor
{
    static String notepad="";
    static Stack<String> undo_delete=new Stack<String>();
    static Stack<String> undo_append=new Stack<String>();
    static Stack<Integer> function_calls=new Stack<Integer>();
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int no_of_ops=Integer.parseInt(x.readLine());
        
        while(no_of_ops-->0)
        {
            String input[]=(x.readLine()).split(" ");
            int type=Integer.parseInt(input[0]);
            if((type==1)||(type==2))
            {
                function_calls.push(type);
                if(type==1) //  append
                {
                    undo_append.push(notepad);
                    notepad=notepad+input[1];
                }
                else    //  delete
                {
                    undo_delete.push(notepad);
                    int K=Integer.parseInt(input[1]);
                    notepad=notepad.substring(0, notepad.length()-K);
                }
            }
            else
            {
                if(type==3) //print
                {
                    int K=Integer.parseInt(input[1])-1;
                    if(K<notepad.length())
                    System.out.println(notepad.charAt(K));
                    else
                    System.out.println(-1);
                }
                else
                {
                    int temp=function_calls.pop();
                    if(temp==1) //  undo append
                    notepad=undo_append.pop();
                    else
                    notepad=undo_delete.pop();
                }
            }
        }
    }    
}
