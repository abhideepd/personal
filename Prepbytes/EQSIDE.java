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

            double dist1=dist(x1, y1, x2, y2);
            double dist2=dist(x1, y1, x3, y3);
            double dist3=dist(x1, y1, x4, y4);
            
            System.out.println(check(dist1, dist2, dist3)?"Yes":"No");
        }
    }
    static double dist(int x1, int y1, int x2, int y2)
    {
        //System.out.println(x1+" "+y1+" "+x2+" "+y2);
        double dist1=(x1-x2)*(x1-x2);
        double dist2=(y1-y2)*(y1-y2);
        //System.out.println(dist1+" "+dist2);
        double dist=Math.sqrt(dist1+dist2);
        return dist;
    }
    static boolean check(double dist1, double dist2, double dist3)
    {
        double sq_root=Math.sqrt(2);

        if((dist1==dist2)&&(dist2==dist3))
        return false;

        if(dist1==dist2)
        {
            if(dist3==(sq_root*dist1))
            return true;
        }

        if(dist1==dist3)
        {
            if(dist2==(sq_root*dist1))
            return true;
        }

        if(dist2==dist3)
        {
            if(dist1==(sq_root*dist2))
            return true;
        }

        return false;
    }
}