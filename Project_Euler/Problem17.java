package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem17 
{
    static ArrayList<String> arr=new ArrayList<String>();
    static ArrayList<String> temp=new ArrayList<String>();
    public static void main(String []args)throws IOException
    {

        arr.add("");    //--    0
        arr.add("one");     //--    1
        arr.add("two");     //--    2
        arr.add("three");   //--    3
        arr.add("four");    //--    4
        arr.add("five");    //--    5
        arr.add("six");     //--    6
        arr.add("seven");   //--    7
        arr.add("eight");   //--    8
        arr.add("nine");    //--    9
        arr.add("ten");     //--    10
        arr.add("eleven");  //--    11
        arr.add("twelve");  //--    12
        arr.add("thirteen");//--    13
        arr.add("fourteen");//--    14
        arr.add("fifteen"); //--    15
        arr.add("sixteen"); //--    16
        arr.add("seventeen");//--   17
        arr.add("eighteen");//--    18
        arr.add("nineteen");//--    19
        arr.add("twenty");  //--    20

        //temp.add("twenty");
        temp.add("thirty");
        temp.add("forty");
        temp.add("fifty");
        temp.add("sixty");
        temp.add("seventy");
        temp.add("eighty");
        temp.add("ninety");
        temp.add("hundered");

        String b="";
        for(int i=21; i<100; i++)
        {
            if(i%10==0)
            {
                arr.add(temp.get((i/10)-3));
            }
            else
            {
                arr.add(arr.get(i-(i%10))+b+arr.get(i%10));
            }
        }
        //arr.add("one hundered");
        for(int i=100; i<1000; i++)
        {
            if(i%100==0)
            arr.add(arr.get(i/100)+b+"hundred");
            else
            arr.add(arr.get(i/100)+b+"hundred"+b+"and"+b+arr.get(i%100));
        }
        arr.add("one"+b+"thousand");
        //System.out.println(arr);
        
        //System.out.println(arr.get(342));
        long sum=0;
        int range=1000;
        for(int i=1; i<=range; i++)
        sum=sum+word_count(i);
        System.out.println(sum);
    }
    static int word_count(int i)
    {
        return arr.get(i).trim().length();
    }
}

