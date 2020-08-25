package Practice;
import java.util.*;
/**
 * test1
 */
public class test1 {

 public static void main(String[] args) {
     String s="abc";
    char arr[]=s.toCharArray();
     System.out.println(1<<(s.length()));
    List<List<Integer>> ans=new ArrayList<List<Integer>>();
     for(int i=0; i<(1<<s.length()); i++)
     {
        int n=i;
        String temp="";
        int k=0;
        while(n!=0)
        {
            if((n&1)!=0)
            temp=temp+arr[k];
            ++k;
            n=n>>1;
        }
        System.out.println(temp);
     }
     char t='A';
     int temp=(int)t;
     System.out.println(temp);
     int a=3;
     int b=-a;
 }   
}