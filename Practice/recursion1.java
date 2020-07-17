package Practice;

public class recursion1 {
    public static void main(String[] args) {
        int a=7;
        int n=3;
        int d=5;
        System.out.println(answer(a, n, d));
    }
    static int answer(int n, int a, int d)
    {
        if(a==0)
        return 1;
        return (((answer(n, a-1, d)%d)*(n%d))%d);
    }
}