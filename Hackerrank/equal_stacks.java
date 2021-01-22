package Hackerrank;
import java.io.*;
import java.util.*;
public class equal_stacks
{
    public static void main(String []args)throws IOException
    {
        String f = "/home/dRazz3R/Documents/Code/personal/Hackerrank/input.txt";
        BufferedReader x=new BufferedReader(new FileReader(f));
        //BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input_lengths[]=(x.readLine()).split(" ");
        String list1[]=(x.readLine()).split(" ");
        String list2[]=(x.readLine()).split(" ");
        String list3[]=(x.readLine()).split(" ");
        List<Integer> List1=new ArrayList<Integer>();
        List<Integer> List2=new ArrayList<Integer>();
        List<Integer> List3=new ArrayList<Integer>();

        for(String i:list1)
        List1.add(Integer.parseInt(i));

        for(String i:list2)
        List2.add(Integer.parseInt(i));

        for(String i:list3)
        List3.add(Integer.parseInt(i));

        System.out.println(equalStacks(List1, List2, List3));
    }
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) 
    {
        // Write your code here 
        Stack<Integer> H1=new Stack<Integer>();
        Stack<Integer> H2=new Stack<Integer>();
        Stack<Integer> H3=new Stack<Integer>();

        fill_stack(H1, h1);
        fill_stack(H2, h2);
        fill_stack(H3, h3);

        //System.out.println(H1);
        //System.out.println(H2);
        //System.out.println(H3);

        if((H1.size()==H2.size())&&(H1.size()==H3.size()))
        return answer(H1, H2, H3);
        else if((H1.size()<=H2.size())&&(H1.size()<=H3.size()))
        return answer(H1, H2, H3);
        else if((H2.size()<=H1.size())&&(H2.size()<=H3.size()))
        return answer(H2, H1, H3);
        else
        return answer(H3, H1, H2);
        
    }
    static int answer(Stack<Integer> H1, Stack<Integer> H2, Stack<Integer> H3)
    {
        while(H1.size()!=0)
        {
            int temp=H1.pop();
            if((H2.indexOf(temp)!=-1)&&(H3.indexOf(temp)!=-1))
            return temp;
        }
        return 0;
    }
    static void fill_stack(Stack<Integer> H, List<Integer> h)
    {
        int sum=0;
        
        for(int i=h.size()-1; i>=0; i--)
        {
            int temp=h.get(i);
            if(sum<0)
            {
                System.out.println("XX");
            }
            sum=sum+temp;
            //H.push(temp);
            H.push(sum);
        }
    }
}
