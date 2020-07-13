package Prepbytes;
import java.io.*;
import java.util.*;
public class AMANSTR {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input=x.readLine();
            int counter=0;
            ArrayList<Integer> arr=new ArrayList<Integer>();
            //count 
            while(counter<=(input.length()-4))
            {
                if((input.charAt(counter)=='a')&&(input.charAt(counter+1)=='m')&&(input.charAt(counter+2)=='a')&&(input.charAt(counter+3)=='n'))
                {
                    arr.add(counter);
                    counter=counter+4;
                }
                else
                ++counter;
            }
            System.out.println(arr);
        }
    }
}