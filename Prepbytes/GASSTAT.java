package Prepbytes;
import java.io.*;
import java.util.*;
public class GASSTAT {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String inputgas[]=(x.readLine()).split(" ");
        String inputcost[]=(x.readLine()).split(" ");
        int sumgas=0, sumcost=0;

        int gas[]=new int[size*2];
        int cost[]=new int[size*2];

        for(int i=0; i<size; i++)
        {
            int tempgas=Integer.parseInt(inputgas[i]);
            int tempcost=Integer.parseInt(inputcost[i]);
            gas[i]=tempgas;
            cost[i]=tempcost;
            sumgas=sumgas+tempgas;
            sumcost=sumcost+tempcost;
        }
        for(int i=size; i<size*2; i++)
        {
            gas[i]=gas[i-size];
            cost[i]=cost[i-size];
        }

        if(sumcost>sumgas)
        System.out.println(-1);
        else
        {

        }
    }
}   