package GeeksforGeeks;
import java.util.*;
public class zoro_concern {
    public static void main(String []args)
    {
        String input[]=("1 3 2 4 7 6 9 10").split(" ");
        int arr[]=new int[input.length];
        for(int i=0; i<input.length; i++)
        arr[i]=Integer.parseInt(input[i]);
        Solutionnn x=new Solutionnn();
        x.pushZerosToEnd(arr, arr.length);

        StringBuilder output=new StringBuilder();

        for(int i=0; i<arr.length; i++)
        output.append(arr[i]+" ");

        //System.out.println(output);

        //String a[]={"3", "30", "34", "5", "9"};
        String a[]={"999999998","999999997","999999999"};
        Arrays.sort(a, new chooot());
        for(int i=0; i<a.length; i++)
        System.out.print(a[i]+" ");

        StringBuilder s=new StringBuilder();
        for(int i=0; i<a.length; i++)
        s.append(a[i]);
        System.out.println("--- "+s);
    }
}
class chooot implements Comparator<String>
{
    public int compare(String a, String b)
    {
        String ab=a+b;
        String ba=b+a;
        return ba.compareTo(ab);
    }
}
class Solutionnn {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int zero_concern=-1;
        for(int i=0; i<n; i++)
        {
            if((zero_concern==-1)&&(arr[i]%2!=0))
            zero_concern=i;
            
            if((zero_concern!=-1)&&(arr[i]%2==0))
            {
                int temp=arr[zero_concern];
                arr[zero_concern]=arr[i];
                arr[i]=temp;
                ++zero_concern;
            }
        }
    }
}
