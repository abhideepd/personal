package Practice;
import java.io.*;
import java.util.*;
public class stock_span 
{
    static Stack<Integer> s=new Stack<Integer>();
    static ArrayList<Integer> input=new ArrayList<Integer>();
    static int index=1;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int inpu=-1;
        //inpu=Integer.parseInt(x.readLine());
        while(inpu!=-1)
        {
            System.out.print("Answer: ");
            System.out.println(next(inpu));
            inpu=Integer.parseInt(x.readLine());
        }        
        StockSpanner obj = new StockSpanner();
        System.out.println("Answer: "+obj.next(100));
        System.out.println("Answer: "+obj.next(80));
        System.out.println("Answer: "+obj.next(60));
        System.out.println("Answer: "+obj.next(70));
        System.out.println("Answer: "+obj.next(60));
        System.out.println("Answer: "+obj.next(75));
        System.out.println("Answer: "+obj.next(85));
        System.out.println("\nNEXT: \n");
        StockSpanner obj1 = new StockSpanner();
        System.out.println("Answer: "+obj1.next(85));
        System.out.println("Answer: "+obj1.next(76));
        System.out.println("Answer: "+obj1.next(43));
        System.out.println("Answer: "+obj1.next(26));
        System.out.println("Answer: "+obj1.next(52));
        //System.out.println("Answer: "+obj1.next(75));
        //System.out.println("Answer: "+obj1.next(85));
    }
    static int next(int price)
    {
        int ans=0;

        while((s.size()!=0)&&(input.get(s.peek()-1)<=price))
        s.pop();

        if(s.size()==0)
        ans=index;
        else
        ans=index-s.peek();
        s.push(index);
        ++index;
        input.add(price);
        return ans;
    }
}
class StockSpanner 
{

    public StockSpanner() 
    {
        /*
        Stack<Integer> s=new Stack<Integer>();
        ArrayList<Integer> input=new ArrayList<Integer>();
        int index=1;
        */
    }
    /*
    static Stack<Integer> s=new Stack<Integer>();
    static ArrayList<Integer> input=new ArrayList<Integer>();
    static int index=1;
    */  
    Stack<Integer> s=new Stack<Integer>();
    ArrayList<Integer> input=new ArrayList<Integer>();
    int index=1;
    public int next(int price) {
        int ans=0;
        while((s.size()!=0)&&(input.get(s.peek()-1)<=price))
        s.pop();

        if(s.size()==0)
        ans=index;
        else
        ans=index-s.peek();
        s.push(index);
        ++index;
        input.add(price);
        return ans;
    }
}