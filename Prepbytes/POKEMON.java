package Prepbytes;
import java.io.*;
import java.util.*;
public class POKEMON {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input1[]=(x.readLine()).split(" ");
            String input2[]=(x.readLine()).split(" ");
            int arnab[]=new int[size];
            int dipyan[]=new int[size];
            ArrayList<Integer> dipayan=new ArrayList<Integer>();
            for(int i=0; i<size; i++)
            {
                arnab[i]=Integer.parseInt(input1[i]);
                dipyan[i]=Integer.parseInt(input2[i]);
                dipayan.add(dipyan[i]);
            }
            Arrays.sort(dipyan);
            Collections.sort(dipayan);
            Arrays.sort(arnab);
            int result=0;
            for(int i=size-1; i>=0; i--)
            {
                int r=dipayan.size()-1;
                while(r>=0)
                {
                    if(dipayan.get(r)<arnab[i])
                    {
                        ++result;
                        dipayan.remove(r);
                        break;
                    }
                    --r;
                }
                if(r==-1)
                dipayan.remove(0);
            }
            System.out.println(result);
        }
    }
}