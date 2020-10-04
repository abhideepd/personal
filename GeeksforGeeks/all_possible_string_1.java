package GeeksforGeeks;
import java.util.*;
import java.io.*;
public class all_possible_string_1  {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input=x.readLine();
        ArrayList<String> arr=spaceString(input);
        for(int i=0; i<arr.size(); i++)
        {
            System.out.print(arr.get(i)+"$");
        }
    }
    static ArrayList<String> answer=new ArrayList<String>();
    static ArrayList<String> spaceString(String str)
    {   
        int size=str.length();
        char buffer[]=new char[2*size];
        buffer[0]=str.charAt(0);

        //for(int i=1; i<2*size; i++)
        //buffer[i]=' ';

        printPatternUtil(str, buffer, 1, 1, size);

        return answer;
    }
    static void printPatternUtil(String str, char buf[], int i, int j, int n)
    {
        if (i == n) { 
            buf[j] = '\0'; 
            //System.out.println(buf); 
            String temp=new String(buf);
            answer.add(temp.trim());
            return; 
        } 
  
        // Either put the character 
        buf[j] = str.charAt(i); 
        printPatternUtil(str, buf, i + 1, j + 1, n); 
  
        // Or put a space followed by next character 
        buf[j] = ' '; 
        buf[j + 1] = str.charAt(i); 
  
        printPatternUtil(str, buf, i + 1, j + 2, n); 
    }
}
