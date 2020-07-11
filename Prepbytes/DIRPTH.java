package Prepbytes;
import java.io.*;
import java.util.*;
public class DIRPTH {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split("/");

        /*for(int i=1; i<input.length; i++)
        {
            System.out.print(i+" "+input[i]+", ");
        }
        System.out.println();*/
        Stack<String> s=new Stack<String>();
        for(int i=1; i<input.length; i++)
        {
            if(input[i].equals(".."))
            s.pop();
            else if(!(input[i].equals(".")))
            {
                s.push(input[i]);
            }
            //System.out.println(s);
        }
        //System.out.println(s);
        String result="";
        while(!(s.isEmpty()))
        {
            result="/"+s.pop()+result;
        }
        System.out.println(result);
    }
}