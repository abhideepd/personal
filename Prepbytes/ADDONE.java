package Prepbytes;
import java.io.*;
public class ADDONE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input=x.readLine();
            node3 arr=new node3();
            node3 head1=arr;
            for(int i=0; i<input.length(); i++)
            {
                int temp=Integer.parseInt(input.charAt(i)+"");
                node3 tempo=new node3();
                tempo.data=temp;
                tempo.next=null;
                arr.next=tempo;
                arr=arr.next;
            }
            node3 xyz=head1.next;
            int number=0;
            while(xyz!=null)
            {
                number=number*10+xyz.data;
                xyz=xyz.next;
            }
            System.out.println(number+1);
        }
    }
}
class node3{
    int data;
    node3 next;
}