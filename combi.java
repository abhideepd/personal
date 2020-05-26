import java.io.*;
public class combi {
    static int arr[];
    static int k;
    static int len;
    public static void main(String[] args)throws IOException {
     
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        arr=new int[input.length];

        for(int i=0; i<input.length; i++)
        {
            arr[i]=Integer.parseInt(input[i]);
        }

        k=3;//
        output();
    }    
    static void output()
    {

    }
    static void xyz(int i, int j)
    {
        if(i+k<len)
        {
            
        }
    }
}