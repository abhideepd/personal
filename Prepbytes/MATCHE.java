package Prepbytes;
import java.io.*;
import java.util.*;
public class MATCHE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String S=x.readLine();
        int T=Integer.parseInt(x.readLine());
        for(int i=0; i<T; i++)
        {
            String P=x.readLine();
            int size=P.length();
            int k=0;
            int ans=0;
            ArrayList<Integer> arr=new ArrayList<Integer>();
            for(int i1=0; i1<S.length(); i1++)
            {
                if(S.charAt(i1)==P.charAt(k))
                {
                    if(k==0)
                    {
                        arr.add(i1);
                    }
                    ++k;
                }
                else{
                    if(k!=0)
                    {
                        k=0;
                        arr.remove(arr.size()-1);
                    }
                }
                if(k==size)
                {
                    k=0;
                    ++ans;
                }
            }
            System.out.println(ans+" ");
            while(arr.size()!=0)
            System.out.println(arr.remove(0)+" ");
            System.out.println();
        }
    }
}