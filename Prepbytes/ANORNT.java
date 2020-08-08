package Prepbytes;
import java.io.*;
public class ANORNT {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T1=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T1; i1++)
        {
            String N=(x.readLine());
            String T=x.readLine();
            int arr_N[]=new int[26];
            int arr_T[]=new int[26];
            for(int i=0; i<N.length(); i++)
            {
                int z=N.charAt(i);
                arr_N[z-97]=arr_N[z-97]+1;
            }
            for(int i=0; i<T.length(); i++)
            {
                int z=T.charAt(i);
                arr_T[z-97]=arr_T[z-97]+1;
            }
            System.out.println(check(arr_N, arr_T));
        }
    }
    static String check(int []arr_N, int []arr_T)
    {
        for(int i=0; i<26; i++)
        {
            if(arr_N[i]!=arr_T[i])
            return "NO";
        }
        return "YES";
    }
}