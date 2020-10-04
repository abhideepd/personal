package GeeksforGeeks;
import java.util.*;
import java.io.*;
public class all_possible_string {
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
    static ArrayList<String> ans=new ArrayList<String>();
    static ArrayList<String> spaceString(String str)
    {   
        chumma(str, ""); 
        return ans;
    }
    static void chumma(String a, String res)
    {
        ans.add(res+a);
        for(int i=1; i<a.length(); i++)
        {
            String temp1=a.substring(0, i)+" ";
            String temp2=a.substring(i, a.length());
            chumma(temp2, res+temp1);
        }
    }
}
