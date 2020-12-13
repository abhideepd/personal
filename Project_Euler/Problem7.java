package Project_Euler;

public class Problem7 
{
    public static void main(String []args)
    {
        //int a=(int)Math.sqrt(600851475143D);
        int a=10000000;
        boolean arr[]=new boolean[a+1];

        for(int i=2; i<=a; i++)
        {
            int j=1;
            while(++j*i<=a)
            arr[j*i]=true;
        }

        int ans=0;
        int counter=0;
        int i=2;
        int lim=10000;
        while(counter<=lim)
        {
            if(arr[i]==false)
            {
                ans=i;
                ++counter;
                System.out.println(counter+" "+ans);
                //break;
            }
            ++i;
        }
        System.out.println(ans);    
    }
}
