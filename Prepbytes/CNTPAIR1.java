package Prepbytes;
import java.io.*;
import java.util.*;
public class CNTPAIR1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //input size and 'K'
        String  input1[]=(x.readLine()).split(" ");
        //input array
        String input2[]=(x.readLine()).split(" ");
        int size=Integer.parseInt(input1[0]);
        int K=Integer.parseInt(input1[1]);
        int arr[]=new int[size];
        int max=-1;
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input2[i]);
            if(max<arr[i])
            max=arr[i];
        }
        HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
        for(int i=0; i<size; i++)
        {
            if(!(hm.containsKey(arr[i])))
            {
                hm.put(arr[i], 1);
            }
            else{
                hm.put(arr[i], ((hm.get(arr[i]))+1) );
            }
        }
        //System.out.println(hm);
        int result=0;
        for(int i=0; i<hm.size(); i++)
        {
            
            int temp1=arr[i];
            int temp2=temp1+K;
            
            //System.out.println(temp1+" "+temp2+"--->"+result);

            /*if(temp2<max+1)
            {
                result=result+(hm.get(temp1)<=hm.get(temp2)?hm.get(temp1):hm.get(temp2));
            }*/
            if(hm.containsKey(temp2))
            {
                ++result;
            }                        
        }
/*
        for (Map.Entry<Integer, Integer> e : hm.entrySet())
        {
            int temp1=e.getKey();
            int temp2=temp1+K;

            if(hm.containsKey(temp2))
            {
                result=result+(hm.get(temp1)<=hm.get(temp2)?hm.get(temp1):hm.get(temp2));
            }
        }*/
        System.out.println(result);
    }
}