package Project_Euler;

public class Problem1 
{
    public static void main(String []args)
    {
        long sum=0;
        boolean arr[]=new boolean[1001];
        for(int i=1; i<1000; i++)
        {
            if(arr[i]==false)
            {
                if((i%3==0)||(i%5==0))
                {
                    System.out.println(i);
                    arr[i]=true;
                    sum=sum+i;
                }
            }
        }
        System.out.println(sum);
    }    
}
