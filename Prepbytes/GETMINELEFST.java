package Prepbytes;
import java.io.*;
import java.util.*;
public class GETMINELEFST {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int q=Integer.parseInt(x.readLine());
        Stack<Integer> s=new Stack<Integer>();
        TreeMap<Integer, Integer> hm=new TreeMap<Integer, Integer>();
        for(int i1=0; i1<q; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int temp1, temp2=0;
            temp1=Integer.parseInt(input[0]);
            if(temp1==1)
            temp2=Integer.parseInt(input[1]);

            if(temp1==1)
            {
                s.push(temp2);
                if(hm.containsKey(temp2))
                hm.put(temp2, hm.get(temp2)+1);
                else
                hm.put(temp2, 1);
            }
            else{
                if(s.size()==0)
                System.out.println(-1);
                else if(temp1==2)
                {
                    int t=s.pop();
                    hm.put(t, hm.get(t)-1);
                    if(hm.get(t)==0)
                    hm.remove(t);
                }
                else if(temp1==3)
                System.out.println(s.peek());
                else{
                    int min=0;
                    for(Map.Entry mm:hm.entrySet())
                    {
                        min=(int)mm.getKey();
                        break;
                    }
                    
                    System.out.println(min);
                }
            }
        }
    }
}