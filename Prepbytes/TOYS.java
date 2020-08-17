package Prepbytes;
import java.io.*;
public class TOYS {
    public static void main(String[] args)throws IOException  {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        String input2[]=(x.readLine()).split(" ");
        int N=Integer.parseInt(x.readLine());
        int animal_d1, animal_c1, animal_m1, bird_p1, bird_s1, bird_k1;
   
        animal_d1=Integer.parseInt(input1[0]);
        bird_p1=Integer.parseInt(input2[0]);

        animal_c1=Integer.parseInt(input1[1]);
        bird_s1=Integer.parseInt(input2[1]);

        animal_m1=Integer.parseInt(input1[2]);
        bird_k1=Integer.parseInt(input2[2]);

        int total_animals=animal_c1+animal_d1+animal_m1;
        int total_birds=bird_k1+bird_p1+bird_s1;

        int shelves=(total_animals/5+((total_animals%5)>0?1:0))+(total_birds/10+((total_birds%10)>0?1:0));

        System.out.println(shelves<=N?"YES":"NO");
    }
}