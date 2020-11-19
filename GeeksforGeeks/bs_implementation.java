package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class bs_implementation {
    static ArrayList<Integer> arr=new ArrayList<Integer>();
    public static void main(String []args)throws IOException
    {
        pre_insert();
        //print_input();
        //search();
        insert_element();
    }
    static void insert_element()
    {
        insert(1);
        print_output();

        insert(21);
        print_output();

        insert(7);
        print_output();

        insert(2);
        print_output();

        insert(19);
        print_output();
    }
    static void insert(int k)
    {
        int l=0, r=arr.size()-1, mid=0;
        while(l<=r)
        {
            mid=(l+r)/2;
            if(arr.get(mid)>k)
            r=mid-1;
            else if(arr.get(mid)<=k)
            l=mid+1;
            //else
            //break;
        }
        System.out.println("\nInserted element:"+k+"  mid:"+mid+"  l:"+l+"  r:"+r);
        arr.add(l, k);
    }
    static void print_input()
    {
        System.out.println("\nInput: "+arr+"\n");
    }
    static void print_output()
    {
        System.out.println("\nOutput: "+arr+"\n");
    }
    static void search()
    {
        /**/
        //  --TestCase - 1
        search_query(2);
        search_query(5);
        search_query(20);
        search_query(21);
        search_query(1);
        /**/

        /*
        //  --TestCase - 2
        search_query(1);
        search_query(10);
        */
    }
    static void search_query(int k)
    {
        System.out.println("Search ["+k+"] "+search(k)+"\n");
    }
    static void pre_insert()
    {

        /**/
        //--  TestCase--1
        arr.add(2);//1
        arr.add(3);//2
        arr.add(3);//3
        arr.add(3);//4
        arr.add(3);//5
        arr.add(4);//6
        arr.add(5);//7
        arr.add(8);//8
        arr.add(10);//9
        arr.add(12);//10
        arr.add(12);//11
        arr.add(13);//12
        arr.add(15);//13
        arr.add(18);//14
        arr.add(19);//15
        arr.add(19);//16
        arr.add(20);//17
        /**/

        /*
        //--  TestCase--2
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(10);
        */
    }
    static int search(int k)
    {
        int l=0, r=arr.size();
        while(l<r)
        {
            int mid=(l+r-1)/2;
            //-- test print starts
            test_print(l, r, mid);
            //-- test print ends
            if(arr.get(mid)>k)
            r=mid-1;
            else if(arr.get(mid)<k)
            l=mid+1;
            else
            return mid;
        }
        return -1;
    }
    static void test_print(int l, int r, int mid)
    {
        System.out.println("l:"+l+" r:"+r+" mid:"+mid);
    }
}
