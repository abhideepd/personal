package Hackerrank;
import java.io.*;
import java.util.*;
public class poisonous_plant_1 
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        int arr[]=new int[input.length];
        for(int i=0; i<input.length; i++)
        arr[i]=Integer.parseInt(input[i]);
        System.out.println("\nAnswer:"+poisonousPlants(arr)+"\n");
    }
    static int poisonousPlants(int[] p) 
    {        
        HashMap<Integer, Integer> delete_index=new HashMap<Integer, Integer>();

        ArrayList<Integer> arr=new ArrayList<Integer>();
        //HashMap<Integer, Integer> arr=new HashMap<Integer, Integer>();

        for(int i:p)
        arr.add(i);

        int ans=0;
        
        do{
            delete_index=new HashMap<Integer, Integer>();
            Stack<Integer> s=new Stack<Integer>();
            //System.out.println(arr);
            for(int i=arr.size()-1; i>=0; i--)
            {
                while((s.size()!=0)&&(arr.get(s.peek())<=arr.get(i)))
                s.pop();

                if(s.size()!=0)
                delete_index.put(s.peek(), 0);
                s.push(i);
            }
            ++ans;
            //System.out.print(delete_index+" "+arr+" ");
            int k=0;
            for(Map.Entry<Integer, Integer> m:delete_index.entrySet())
            {
                int index=(int)m.getKey();
                //System.out.println(arr+" "+index+" "+arr.size());
                arr.remove(index-k++);
            }
            //System.out.println(arr);
        } while(delete_index.size()!=0);
        
        return ans-1;
    }
}
