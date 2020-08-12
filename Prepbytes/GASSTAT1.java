package Prepbytes;
import java.io.*;
import java.util.*;
public class GASSTAT1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String gas_station[]=(x.readLine()).split(" ");
        String cost[]=(x.readLine()).split(" ");
        
        Queue<Integer> q_gas=new LinkedList<Integer>();
        Queue<Integer> q_cost=new LinkedList<Integer>();

        for(int i=0; i<size; i++)
        q_cost.add(Integer.parseInt(cost[i]));

        for(int i=0; i<size; i++)
        q_gas.add(Integer.parseInt(gas_station[i]));

        int k=0;
        while(k!=size)
        {
            Queue gas_q=new LinkedList<>(q_gas);
            Queue cost_q=new LinkedList<>(q_cost);

            if(check(gas_q, cost_q))
            break;
            
            q_gas.add(q_gas.remove());
            q_cost.add(q_cost.remove());
            ++k;
        }
        if(k==size)
        System.out.println(-1);
        else
        System.out.println(k);
    }
    static boolean check(Queue<Integer> q, Queue<Integer> cost)
    {
        long fuel=0;
        //System.out.println(q);
        while(q.size()!=0)
        {
            fuel=fuel+q.remove();
            if(fuel<cost.remove())
            return false;
        }
        return true;
    }
}