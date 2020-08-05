package Prepbytes;
import java.util.*;
import java.io.*;
public class LRGSTNO1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            ArrayList<String> arr=new ArrayList<String>();
            for(int i=0; i<size; i++)
            {
                arr.add(input[i]);
            }
            Collections.sort(arr, new Comparator<String>(){
                public int compare(String X, String Y)
                {
                    String XY=X+Y;
                    String YX=Y+X;
                    return XY.compareTo(YX)>0?1:-1;
                }
            });
            while(arr.size()!=0)
            {
                System.out.print(arr.remove(arr.size()-1));
            }
            System.out.println();
        }
    }
}