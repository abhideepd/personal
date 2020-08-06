package Prepbytes;
import java.io.*;
public class EQSIDE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int x1=Integer.parseInt(input[0]);
            int y1=Integer.parseInt(input[1]);
            int x2=Integer.parseInt(input[2]);
            int y2=Integer.parseInt(input[3]);
            int x3=Integer.parseInt(input[4]);
            int y3=Integer.parseInt(input[5]);
            int x4=Integer.parseInt(input[6]);
            int y4=Integer.parseInt(input[7]);

            int dist1=dist(x1, y1, x2, y2);
            int dist2=dist(x1, y1, x3, y3);
            int dist3=dist(x1, y1, x4, y4);
            
            if(dist1==dist2)
            {
                int dist_y1=dist(x2, y2, x4, y4);
                int dist_y2=dist(x3, y3, x4, y4);
                if(dist_y1==dist_y2)
                System.out.println("Yes");
            }
            else if(dist1==dist3)
            {
                int dist_y1=dist(x3, y3, x4, y4);
                int dist_y2=dist(x3, y3, x2, y2);
                if(dist_y1==dist_y2)
                System.out.println("Yes");
            }
            else if(dist2==dist3)
            {
                int dist_y1=dist(x2, y2, x4, y4);
                int dist_y2=dist(x3, y3, x2, y2);
                if(dist_y1==dist_y2)
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
    static int dist(int x1, int y1, int x2, int y2)
    {
        int dist1=(x1-x2)*(x1-x2);
        int dist2=(y1-y2)*(y1-y2);
        int dist=(int)Math.sqrt(dist1+dist2);
        return dist;
    }
}