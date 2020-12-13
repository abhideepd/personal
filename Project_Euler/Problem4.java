package Project_Euler;

public class Problem4 {
    public static void main(String []args)
    {
        int a=900000;
        int b=999999;

        for(; a<=b; a++)
        {
            if(palincheck(a))
            {
                //System.out.print(a+" ");
                for(int i=999; i>=100; i--)
                {
                    if(a%i==0)
                    {
                        System.out.println(a+" "+i+" "+(a/i));
                        break;
                    }
                }
                //System.out.println();
            }
        }
    }
    static boolean palincheck(int a)
    {
        int sum=0;
        int orig=a;
        while(a!=0)
        {
            sum=sum*10+a%10;
            a=a/10;
        }
        if(sum==orig)
        return true;
        return false;
    }
}
