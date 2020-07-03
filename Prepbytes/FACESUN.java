package Prepbytes;
import java.io.*;
public class FACESUN {
    public static void main(String[] args)throws IOException {

       // System.out.println(countBuildings(arr, arr.length)); 

        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");

            int arr[]=new int[size];
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
            }

            System.out.println(countBuildings(arr, arr.length));
        }
        
    }
    static int countBuildings(int arr[], int n) 
    { 
        // Initialuze result  (Note that first building 
        // always sees sunlight) 
        int count = 1; 
       
        // Start traversing element 
        int curr_max = arr[0]; 
        for (int i=1; i<n; i++) 
        { 
            // If curr_element is maximum, 
            // update maximum and increment count 
            if (arr[i] > curr_max) 
            { 
                count++; 
                curr_max=arr[i]; 
            } 
        } 
       
        return count; 
    } 
}