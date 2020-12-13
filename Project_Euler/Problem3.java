package Project_Euler;

public class Problem3 
{
    public static void main(String []args)
    {
        int a=(int)Math.sqrt(600851475143D);
        boolean arr[]=new boolean[a+1];

        for(int i=2; i<=a; i++)
        {
            int j=1;
            while(++j*i<=a)
            arr[j*i]=true;
        }

        int ans=0;
        for(int i=a; i>=0; i--)
        {
            if(arr[i]==false)
            {
                if(600851475143L%i==0)
                {
                    ans=i;
                    break;
                }
            }
        }

        System.out.println(ans);
    }    
}
