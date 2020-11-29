package Codeforces;
import java.io.*;
public class prob15 {
    public static void main(String []args)throws IOException
    {   
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        while(t-->0)
        {
            String input_nm[]=(x.readLine()).split(" ");
            int n=Integer.parseInt(input_nm[0]);
            int m=Integer.parseInt(input_nm[1]);
            String ans="NO";

            for(int i=0; i<n; i++)
            {
                //if(m%2!=0)
                //break;

                String input_n1[]=(x.readLine()).split(" ");
                String input_n2[]=(x.readLine()).split(" ");
                int n_1_1=Integer.parseInt(input_n1[0]);
                int n_1_2=Integer.parseInt(input_n1[1]);
                int n_2_1=Integer.parseInt(input_n2[0]);
                int n_2_2=Integer.parseInt(input_n2[1]);

                if(n_1_2==n_2_1)
                {
                    ans="YES";
                    //break;
                }
            }
            
            if(m%2!=0)
            ans="NO";

            System.out.println(ans);
        }
    }
}
