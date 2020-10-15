package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class sticker_thief
{
    int max;
    sticker_thief()
    {
        max=Integer.MIN_VALUE;
    }

    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=1;
        //t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            //sticker_thief obj_1=new sticker_thief();
            /*
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            starter(input);
            */

            tcc obj=new tcc();
            starter(obj.inp1, new sticker_thief());
            starter(obj.inp2, new sticker_thief());
        }
    }
    static void starter(String inp[], sticker_thief obj)
    {
        int arr[]=new int[inp.length];
        for(int i=0; i<inp.length; i++)
        arr[i]=Integer.parseInt(inp[i]);
        answer(arr, obj, 0, 0);
        answer(arr, obj, 0, 1);
        
        System.out.println(obj.max);
    }
    static void answer(int []arr, sticker_thief obj, int sum, int i)
    {
        obj.max=Math.max(obj.max, sum);

        if(i>=arr.length)
        return;

        if((sum+arr[i]>=sum+arr[i+1]))
        {
            //obj.max=sum+arr[i+2];
            answer(arr, obj, sum+arr[i], i+2);
        }
        else
        {
            //obj.max=sum+arr[i+3];
            answer(arr, obj, sum+arr[i], i+3);
        }
    }
}
class tcc
{
    String inp1[]=("5 5 10 100 10 5").split(" ");
    String inp2[]=("1 2 3").split(" ");
    String inp3="";
    String inp4="";
    String inp5="";
}