package Project_Euler;
import java.io.*;
public class Problem13 
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String a[]=new String[100];

        //Input
        for(int i=0; i<100; i++)
        a[i]=(x.readLine());

        String sum="";
        int carry=0;

        //Addition
        for(int i=49; i>=0; i--)
        {
            int temp_sum=0;
            for(int j=0; j<100; j++)
            {
                temp_sum=temp_sum+Integer.parseInt(a[j].charAt(i)+"");
            }
            temp_sum=temp_sum+carry;
            carry=temp_sum/10;
            temp_sum=temp_sum%10;
            sum=temp_sum+sum;
        }
        sum=carry+sum;
        System.out.println("ANSWER:-");
        System.out.println(sum);
        for(int i=0; i<10; i++)
        System.out.print(sum.charAt(i));
    }
}
