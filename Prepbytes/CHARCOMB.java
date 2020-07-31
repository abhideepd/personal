package Prepbytes;
import java.io.*;
public class CHARCOMB {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i=0; i<T; i++)
        {
            String input[]=(x.readLine()).split(" ");

            xyz(input[0], input[1], Integer.parseInt(input[2]), "", 0);
        }
    }
    static void xyz(String c1, String c2, int K, String ans, int control)
    {
        if(ans.length()==K)
        {
            System.out.println(ans);
        }
        else{
            if(control!=2)
            {
                xyz(c1, c2, K, ans+c1, 1);
                xyz(c1, c2, K, ans+c2, 2);
            }
            else{
                xyz(c1, c2, K, ans+c1, 1);
            }
        }
    }
}