package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem62 
{
    static ArrayList<Long> cube=new ArrayList<Long>();
    static ArrayList<Integer> nos=new ArrayList<Integer>();
    static ArrayList<Long> cube_root=new ArrayList<Long>();
    static int limit=9000;
    public static void main(String []args)throws IOException
    {
        function1();
        func2();
        //testing1();
        //testing2();
    }
    static void testing2()
    {
        long a=sort(127035954683L);
        System.out.println(a+" "+cube.indexOf(a));
        //System.out.println(nos.get(cube.indexOf(a)));
    }
    static void testing1()
    {
        long x=5027;
        long a=x*x*x;
        //System.out.println(nos.get(cube_root.indexOf(x)));
        System.out.println(cube.indexOf(a));
        //System.out.println(cube.size()+" "+nos.size()+" "+cube_root.size());        
    }
    static void func2()
    {
        for(int i=0; i<nos.size(); i++)
        {
            if(nos.get(i)>=5)
            {
                long temp=cube_root.get(i);
                System.out.println(cube.get(i)+" -----> "+cube_root.get(i)+" -----> "+nos.get(i)+" ----> "+(temp*temp*temp));
                //break;
            }
        }
    }
    static void function1()
    {
        for(long i=1; i<=limit; i++)
        {
            long prod=(long)i*i*i;
            fill(i, prod);
        }
    }
    static void fill(long x, long x_cube)
    {
        long a=sort(x_cube);
        if(cube.indexOf(a)==-1)
        {
            cube.add(a);
            nos.add(1);
            cube_root.add(x);
        }
        else
        {
            //nos.add(nos.get(cube.indexOf(a))+1);
            //System.out.println(a);
            nos.set(cube.indexOf(a), nos.get(cube.indexOf(a))+1);
        }
    }
    static long sort(long a)
    {
        ArrayList<Long> temp=new ArrayList<Long>();
        while(a!=0)
        {
            temp.add(a%10);
            a=a/10;
        }
        //System.out.println(temp);
        Collections.sort(temp, Collections.reverseOrder());
        long no=0;
        for(int i=0; i<temp.size(); i++)
        {
            no=no*10+(long)temp.get(i);
        }
        return no;
    }
}
