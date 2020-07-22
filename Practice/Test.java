package Practice;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        
        PrintStream o = new PrintStream(new File("A.txt")); 
  
        // Store current System.out before assigning a new value 
        PrintStream console = System.out; 
  
        // Assign o to output stream 
        System.setOut(o); 
        //System.out.println("This will be written to the text file");

        int n=1234560;
        for(int i=0; i<10000; i++)
        System.out.print(n+i+" ");
  
        // Use stored value for output stream 
        System.setOut(console); 
        System.out.println("This will be written on the console!");         
    }
}