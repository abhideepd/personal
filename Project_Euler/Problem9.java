package Project_Euler;

public class Problem9 
{
    public static void main(String []args)
    {
        int a=0, b=0, c=0;
        for(int i=1; i<1000; i++)
        {
            for(int j=i+1; j<1000; j++)
            {
                int temp=(int)Math.sqrt((i*i)+(j*j));
                if((temp*temp)==((i*i)+(j*j)))
                {
                    if(temp+i+j==1000)
                    {
                        a=temp;
                        b=i;
                        c=j;
                        break;
                    }
                }
            }
        }
        System.out.println(a+" "+b+" "+c);
        System.out.println(a*b*c);
    }    
}
