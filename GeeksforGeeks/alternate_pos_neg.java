package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class alternate_pos_neg {
    public static void main(String []args)throws IOException
    {
        Solution_x obj_1=new Solution_x();
        tc_1 obj_2=new tc_1();

        //Input Starts

        String inp[]=(obj_2.inp17).split(" ");

        //Input Ends
        
        int arr[]=new int[inp.length];

        for(int i=0; i<inp.length; i++)
        arr[i]=Integer.parseInt(inp[i]);

        //System.out.println("Input:");
        //obj_1.output(arr);

        //System.out.println("Output:");

        obj_1.rearrange(arr, arr.length);
    }
}
class tc_1{
    // starts with negative nos.
    String inp1="-1 -1 -1 -1 -1";
    String inp2="-1 3 3 3 3 3 3";
    String inp3="-1 -1 3 3 3 3 3";
    String inp4="-1 -1 -1 3 3 3";
    String inp5="-1 -1 -1 3 3";
    String inp6="-1 3 -1 3";
    String inp7="-1 3 3 3 3 3 3 -1";
    // starts with positive nos.
    String inp8="9 4 -2 -1 5 0 -5 -3 2";
    String inp9="-5 -2 5 2 4 7 1 8 0 -8";
    String inp10="1 1 1 1 1 1 1 1";
    String inp11="1 -1 -1 -1 -1 1";
    String inp12="1 -1 3 -1 2 -4";
    String inp13="1 -2 3 4 5 5 5 -2 -2 3 -2 0 0 0 0";
    String inp14="1 -1 -1 -1 -1 -1 -1";
    String inp15="1";
    String inp16="-1";
    String inp17="1 1 2 -1 -1 -2 -3 -4 -5";
    String inp18="-1 2 -3 4 5 6 -7 8 9";
    String inp19="1 2 3 -4 -1 4";
    String inp20="-5 -2 5 2 4 7 1 8 0 -8";
}
 class Solution_x {
    void rearrange(int arr[], int n) {
        // code here
        
        int pos_nos[]=new int[n], neg_nos[]=new int[n];
        int neg_arr_index=0, pos_arr_index=0;
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<0)
            neg_nos[neg_arr_index++]=arr[i];
            else
            pos_nos[pos_arr_index++]=arr[i];
        }
        if(arr[0]<0)//start with negative index
        {
            merge_1(pos_nos, pos_arr_index, neg_nos, neg_arr_index, n);
        }
        else
        {
            merge_2(pos_nos, pos_arr_index, neg_nos, neg_arr_index, n);
        }
    }
    static void merge_1(int []pos_nos, int pis_index, int neg_mos[], int neg_index, int n)
    {
        int answer[]=new int[n];
        
        if(neg_index>=pis_index)
        {
            for(int i=0; i<n; i++)
            answer[i]=-1;
            
            //positive nos.-- first
            int i=1, k=0;
            for(int i1=0; i1<pis_index; i1++)
            {
                answer[i]=pos_nos[i1];
                i=i+2;
            }
            
            //negative nos.-- second
            for(int j=0; j<n; j++)
            {
                if(answer[j]==-1)
                answer[j]=neg_mos[k++];
                //++k;
            }
            output(answer);
        }
        else
        {
            for(int i=0; i<n; i++)
            answer[i]=1;
            
            int i=0;
            //print negative nos.-- first
            for(int i1=0; i1<neg_index; i1++)
            {
                answer[i]=neg_mos[i1];
                i=i+2;
            }
            //print positive nos.-- second
            i=0;
            for(int j=0; j<n; j++)
            {
                if(answer[j]==1)
                answer[j]=pos_nos[i++];
            }
            output(answer);
        }
    }
    static void merge_2(int []pos_nos, int pis_index, int neg_mos[], int neg_index, int n)
    {
        int answer[]=new int[n];
        
        if(neg_index>=pis_index)
        {
            for(int i=0; i<n; i++)
            answer[i]=-1;
            
            //positive nos.-- first
            int i=0, k=0;
            for(int i1=0; i1<pis_index; i1++)
            {
                answer[i]=pos_nos[i1];
                i=i+2;
            }
            
            //negative nos.-- second
            for(int j=0; j<n; j++)
            {
                if(answer[j]==-1)
                answer[j]=neg_mos[k++];
                //++k;
            }
            output(answer);
        }
        else
        {
            for(int i=0; i<n; i++)
            answer[i]=1;
            
            int i=1;
            //print negative nos.-- first
            for(int i1=0; i1<neg_index; i1++)
            {
                answer[i]=neg_mos[i1];
                i=i+2;
            }
            //print positive nos.-- second
            i=0;
            for(int j=0; j<n; j++)
            {
                if(answer[j]==1)
                answer[j]=pos_nos[i++];
            }
            output(answer);
        }
    }
    static void output(int []arr)
    {
        StringBuilder output=new StringBuilder();
        for(int i=0; i<arr.length; i++)
        output.append(arr[i]+" ");
        System.out.println(output);
    }
}