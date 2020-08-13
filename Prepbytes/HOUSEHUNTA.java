    package Prepbytes;
    import java.io.*;
    public class HOUSEHUNTA {
        public static void main(String[] args)throws IOException {
            BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
            String input[]=(x.readLine()).split(" ");
            double annual_salary1=Double.parseDouble(input[0]);
            double total_cost=Double.parseDouble(input[1]);
            double portion_saved=Double.parseDouble(input[2]);
            double portion_down_payment=(double)(0.25*total_cost);
            double additional_interest=(double)(0.04/12);
            double portion_saved_amt=0;
            double annual_salary=annual_salary1/12;
            int k=1;
            while(k<=Integer.MAX_VALUE)
            {
                System.out.println(portion_saved_amt);
                portion_saved_amt=portion_saved_amt+(annual_salary*portion_saved)+additional_interest*portion_saved_amt;
                if(portion_saved_amt>=portion_down_payment)
                break;
                ++k;
            }
            //System.out.println(k+"  "+portion_saved_amt+" "+portion_down_payment+" "+total_cost);
            System.out.println(k);
        }
    }