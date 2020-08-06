package Prepbytes;
import java.io.*;
public class UNQCL {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        int counter[]=new int[1001];
        int result=size;
        for(int i=0; i<size; i++)
        {
            int temp=Integer.parseInt(input[i]);
            counter[temp]=counter[temp]+1;
            if(counter[temp]==2)
            result-=2;
            if(counter[temp]>2)
            --result;
        }
        System.out.println(result>=0?result:0);
    }
}