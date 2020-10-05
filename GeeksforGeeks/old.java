package GeeksforGeeks;
import java.io.*;
public class old {
    static int dist=1;
    static int M=0;
    static int T=0;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i=0; i<t; i++)
        {
            T=0;
            dist=1;
            String input[]=(x.readLine()).split(" ");
            int n=Integer.parseInt(input[0]);
            M=Integer.parseInt(input[1]);
            tower(n, 1, 3, 2);
            //System.out.println(dist+" ");
        }
    }
    public static void tower(int n, int from, int to, int buffer)
    {
        if(n==1)
        {
            //System.out.println("move disk "+n+" from rod "+from+" to rod "+to+" "+ ++T);
            ++T;
            print(from, to);
            //System.out.println(dist);
            return;
        }
        dist=dist+1;
        tower(n-1, from, buffer, to);
        dist=dist+1;
        //System.out.println("move disk "+n+" from rod "+from+" to rod "+to+" "+ ++T); 
        ++T;
        print(from, to);
        tower(n-1, buffer, to, from);       
    }
    static void print(int frm, int to)
    {
        if(T==M)
        System.out.println(frm+" "+to);
    }
}
