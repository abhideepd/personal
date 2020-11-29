package Codeforces;
import java.io.*;
public class prob18 {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(x.readLine());
        String Alice_input[]=(x.readLine()).split(" ");
        String Bob_input[]=(x.readLine()).split(" ");

        //Alice
        int a1=Integer.parseInt(Alice_input[0]);    //  Rock
        int a2=Integer.parseInt(Alice_input[1]);    //  Scissor
        int a3=Integer.parseInt(Alice_input[2]);    //  Papre
        
        //Bob
        int b1=Integer.parseInt(Bob_input[0]);    //  Rock
        int b2=Integer.parseInt(Bob_input[1]);    //  Scissor
        int b3=Integer.parseInt(Bob_input[2]);    //  Papre

        int alice_max_win=Math.min(a1, b2)+Math.min(a2, b3)+Math.min(a3, b1);
        int alice_loss=0, alice_min_win=0;

        /*
        int a1_b1=Math.min(a1, b1);
        alice_loss=alice_loss+a1_b1;
        a1=a1-a1_b1;
        b1=b1-a1_b1;

        int a2_b2=Math.min(a2, b2);
        alice_loss=alice_loss+a2_b2;
        a2=a2-a2_b2;
        b2=b2-a2_b2;

        int a3_b3=Math.min(a3, b3);
        alice_loss=alice_loss+a3_b3;
        a3=a3-a3_b3;
        b3=b3-a3_b3;

        alice_loss=alice_loss+Math.min(a1, b3)+Math.min(a2, b1)+Math.min(a3, b2);
        int alice_min_win=n-alice_loss;
        */
        

        /*
        int a1_b3=Math.min(a1, b3);
        alice_loss=alice_loss+a1_b3;
        a1 = a1 - a1_b3;
        b3 = b3 - a1_b3;

        int a2_b1=Math.min(a2, b1);
        alice_loss=alice_loss+a2_b1;
        a2 = a2 - a2_b1;
        b1 = b1 - a2_b1;

        int a3_b2=Math.min(a3, b2);
        alice_loss=alice_loss+a3_b2;
        a3 = a3 - a3_b2;
        b3 = b3 - a3_b2;

        alice_loss = alice_loss + Math.min(a1, b1)+Math.min(a2, b2) + Math.min(a3, b3);
        int alice_min_win = n - alice_loss; 
        */

        int min_a=Math.min(a1, b1+b3);
        a1=Math.max(0, a1-min_a);
        b1=Math.max(0, b1-min_a);
        b3=Math.max(0, b3-min_a);

        int min_b=Math.min(a2, b2+b1);
        a2=Math.max(0, a2-min_b);
        b2=Math.max(0, b2-min_b);
        b1=Math.max(0, b1-min_b);

        int min_c=Math.min(a3, b3+b2);
        a3=Math.max(0, a3-min_c);
        b3=Math.max(0, b3-min_c);
        b2=Math.max(0, b2-min_c);

        alice_loss=min_a+min_b+min_c;
        alice_min_win=n-alice_loss;

        System.out.println(alice_loss+" "+alice_min_win+" "+alice_max_win);
    }
}
