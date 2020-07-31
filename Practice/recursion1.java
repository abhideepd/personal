package Practice;

public class recursion1 {
    public static void main(String[] args) {
        int a=3;
        int n=7;
        int d=5;
        System.out.println(answer(n, a, d));
    }
    static int answer(int n, int a, int d)
    {
        if(a==0)
        return 1;

        int temp=((answer(n, a-1, d)%d)*(n%d))%d;

        if(a%2==0)
        {            
            temp=answer(n, a/2, d);
            temp=((temp%d)*(temp%d))%d;
        }
        
        return temp;
    }
}