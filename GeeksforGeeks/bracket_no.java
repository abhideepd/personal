package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class bracket_no {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input=x.readLine();
        Solutioaaaan obj=new Solutioaaaan();
        System.out.println(obj.barcketNumbers(input));
    }
}
class Solutioaaaan {
    ArrayList<Integer> barcketNumbers(String S) {
        // code here
        int k=0;
        ArrayList<Integer> answer=new ArrayList<Integer>();
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0; i<S.length(); i++)
        {
            if(S.charAt(i)=='(')
            {
                ++k;
                s.add(k);
                answer.add(k);
            }
            else if(S.charAt(i)==')')
            {
                answer.add(s.pop());
            }
        }
        return answer;
    }
};