package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem43 
{
    static char no_arr[]={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static ArrayList<String> permutations=new ArrayList<String>();
    static ArrayList<String> answer=new ArrayList<String>();
    static String a="";
    static boolean choice[]=new boolean[10];
    public static void main(String []args)throws IOException
    {
        generate_permutation();
        //print_permutations();
        //testing1();
        main_function();
    }
    static void testing1()
    {
        int index=permutations.indexOf("1406357289");
        System.out.println(check(index));
        System.out.println(check(2));
    }
    static void main_function()
    {
        long ans=0;
        for(int i=0; i<permutations.size(); i++)
        {
            if(check(i))
            {
                ans=ans+Long.parseLong(permutations.get(i));
                //answer.add(permutations.get(i));
            }
        }
        System.out.println("Answer:"+ans);
    }
    static boolean check(int i)
    {
        int d234=d(2, 3, 4, i);
        int d345=d(3, 4, 5, i);
        int d456=d(4, 5, 6, i);
        int d567=d(5, 6, 7, i);
        int d678=d(6, 7, 8, i);
        int d789=d(7, 8, 9, i);
        int d8910=d(8, 9, 10, i);

        if((d234%2==0)&&(d345%3==0)&&(d456%5==0)&&(d567%7==0)&&(d678%11==0)&&(d789%13==0)&&(d8910%17==0))
        return true;
        return false;
    }
    static int d(int a, int b, int c, int i)
    {
        String ans="";
        String no=permutations.get(i);
        ans=no.charAt(a-1)+""+no.charAt(b-1)+no.charAt(c-1);
        int number=Integer.parseInt(ans);
        return number;
    }
    static void print_permutations()
    {
        System.out.println(permutations.size());
        for(int i=0; i<10; i++)
        System.out.println(permutations.get(i));
    }
    static void generate_permutation()
    {
        if(a.length()==10)
        {
            permutations.add(a);
        }
        else
        {
            for(int i=0; i<10; i++)
            {
                if(choice[i]==true)continue;
                choice[i]=true;
                String temp=a;
                a=a+no_arr[i];
                //System.out.printn
                generate_permutation();
                a=temp;
                choice[i]=false;
            }
        }
    }
}
