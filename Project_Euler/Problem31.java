package Project_Euler;
import java.util.*;
import java.io.*;
public class Problem31 
{
    public static void main(String []args)throws IOException
    {
        coin_sum();
    }
    static void coin_sum()
    {
        int ans=0;
        for(int i1=0; i1<=200; i1++)
        {
            for(int i2=0; i2<=200; i2+=2)
            {
                for(int i5=0; i5<=200; i5+=5)
                {
                    for(int i10=0; i10<=200; i10+=10)
                    {
                        for(int i20=0; i20<=200; i20+=20)
                        {
                            for(int i50=0; i50<=200; i50+=50)
                            {
                                for(int i100=0; i100<=200; i100+=100)
                                {
                                    for(int i200=0; i200<=200; i200+=200)
                                    {
                                        int sum=i1+i2+i5+i10+i20+i50+i100+i200;
                                        if(sum==200)
                                        ++ans;
                                        if(sum>200)
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Answer: "+ans);
    }
}
