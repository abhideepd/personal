package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem19 
{
    static int limit=2000;
    static String days[]={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    static String month[]={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static void main(String []args)throws IOException
    {
        //limit=1900;
        count_days();
    }
    static void count_days()
    {
        //  find how many sundays fell on the 1st of the month
        int ans=0;
        int month_end=0;
        for(int i=1900; i<=limit; i++)
        {
            for(int j=1; j<=12; j++)
            {
                int temp=no_of_days(j, i);
                month_end=(month_end+temp)%7;
                //System.out.println(month[j-1]+" "+days[month_end]+" "+month_end+" "+(temp));
                if(month_end==6)
                ++ans;
            }
            if(i==1900)ans=0;
        }
        System.out.println("Answer: "+ans);
    }
    static int no_of_days(int month, int year)
    {
        if(month==2)
        {
            if(year%4==0)   //--    if its a leap year
            {
                if(year%100==0) //-- if its a century
                {
                    if(year%400==0)
                    return 29;
                    else
                    return 28;
                }
                else
                {
                    return 29;
                }
            }
            else
            {
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
