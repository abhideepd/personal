package Practice;
import java.util.*;
public class xy 
{
    public static void main(String[] args) 
    {
        int n=8;
        int a=(int)Math.ceil(Math.log(n)/Math.log(2));
        int ans=((int)Math.pow(2, a))*2-1;
        System.out.println(ans);
    }
}