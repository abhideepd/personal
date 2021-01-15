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

        while((H1.size()!=0)&&(H2.size()!=0)&&(H3.size()!=0))
        {
            if((H1.peek()==H2.peek())&&(H1.peek()==H3.peek()))
            return H1.peek();
            
            else if((H1.peek()>=H2.peek())&&(H1.peek()>=H3.peek()))
            {
                H1.pop();
                H1.pop();
            }
            else if((H2.peek()>=H1.peek())&&(H2.peek()>=H3.peek()))
            {
                H2.pop();
                H2.pop();
            }
            else
            {
                H3.pop();
                H3.pop();
            }
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
            H.push(temp);
            H.push(sum);
        }
    }
}
