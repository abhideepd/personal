package GeeksforGeeks;
import java.io.*;
public class hanoi {
    static int dist=1;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i=0; i<t; i++)
        {
            dist=1;
            int n=Integer.parseInt(x.readLine());
            tower(n, 1, 3, 2);
            System.out.println(dist);
        }
    }
    public static void tower(int n, int from, int to, int buffer)
    {
        if(n==1)
        {
            System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
            //System.out.println(dist);
            return;
        }
        dist=dist+1;
        tower(n-1, from, buffer, to);
        dist=dist+1;
        System.out.println("move disk "+n+" from rod "+from+" to rod "+to); 
        tower(n-1, buffer, to, from);       
    }
}
