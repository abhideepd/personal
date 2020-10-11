package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class decode_string {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());

        for(int i1=0; i1<t; i1++)
        {
            String input=x.readLine();
            Stack<String> s=new Stack<String>();
            for(int i=input.length()-1; i>=0; i--)
            {
                char temp=input.charAt(i);
                String garbage="";
                if(temp=='[')
                {
                    while(s.peek().charAt(0)!=']')
                    {
                        garbage=garbage+s.pop();
                    }
                    s.pop();
                    String final_garbage="";
                    
                    int counter=0;
                    String counter_garage="";
                    while((i>0)&&(((input.charAt(i-1))=='0')||((input.charAt(i-1))=='1')||((input.charAt(i-1))=='2')||((input.charAt(i-1))=='3')||((input.charAt(i-1))=='4')||((input.charAt(i-1))=='5')||((input.charAt(i-1))=='6')||((input.charAt(i-1))=='7')||((input.charAt(i-1))=='8')||((input.charAt(i-1))=='9')))
                    counter_garage=input.charAt(--i)+counter_garage;
                    counter=Integer.parseInt(counter_garage);
                    //System.out.println(counter_garage);
                    //counter=Integer.parseInt(input.charAt(--i)+"");
                    while(counter-->0)
                    final_garbage=final_garbage+garbage;
                    s.push(final_garbage);
                }
                else
                s.push(temp+"");
            }
            //while(s.size()!=0)
            //if((s.peek().charAt(0)!='[')||(s.peek().charAt(0)!=']'))
            //System.out.print(s.pop());
            //System.out.println();
            System.out.println(s.pop());
        }
    }
}
