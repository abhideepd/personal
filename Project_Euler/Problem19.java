package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem19 
{
    public static void main(String []args)throws IOException
    {
        BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
            /*
            Position of First Day of the month
            0   --> Sunday
            1   --> Monday
            2   --> Tuesday
            3   --> Wednesday
            4   --> Thursday
            5   --> Friday
            6   --> Saturday
            */
        int ans=0;
        int prev=0;
        for(int i=1900; i<=2000; i++)
        {
            int temp=0;
            for(int j=1; j<=12; j++)
            {
                temp=no_of_days(j, i)+prev;
            }
        }

    }
    static int no_of_days(int month, int year)
    {
        if(month==2)
        {
            if(year%100==0)     //--    Century
            {
                if(year%400==0)
                return 29;
            }
            else        //--    Not a Century
            {
                if(year%4==0)
                return 29;
                else
                return 28;
            }
        }
        else if((month==9)||(month==4)||(month==6)||(month==11))
        {      //September  //April     //June      //November
            return 30;
        }
        return 31;
    }
}
