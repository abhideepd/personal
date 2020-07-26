import java.io.*;
import java.util.*;
/*
 * This file was created by ayush in attempt to solve the problem problems
 */
public class main {

    public static int Sum(int n){
     return n*(n+1)/2;
    
    }

    public void solve(String input, PrintWriter out) {
 int[] MatchPos = new int[5000];
 char[] ModifiedInput = input.toCharArray();
 int len = input.length();
 int index = 0;
 for(int i=0;i<len-3;i++){
  if(ModifiedInput[i]=='a' && ModifiedInput[i+1]=='m' && ModifiedInput[i+2]=='a' && ModifiedInput[i+3]=='n'){
   MatchPos[index++]=i;
  }
 
 }

 int ans=0;
 if(index==0){
  ans=0;
 }else{
  ans=Sum(MatchPos[0]+3);
  for(int i=0;i<index-1;i++){
   ans+=Sum(MatchPos[i+1]-MatchPos[i]+2);
  }
  ans+=Sum(len-MatchPos[index-1]-1);
  ans-=3*index;  
 
 }
 System.out.println("ans:"+ans+" "+Sum(len));
 out.println(ans==0 ? ans : Sum(len)-ans);
    }

    public static void main(String[] args) throws IOException {
 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String input = in.readLine();
        Date t1 = new Date();
        main solver = new main();
        solver.solve(input, out);
        out.flush();
        Date t2 = new Date();
        System.err.println(String.format("Your program took %f seconds", (t2.getTime() - t1.getTime()) / 1000.0));
        out.close();
 
  
 
    }

    static class IOUtils {

        public static int[] readIntArray(Scanner in, int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++)
                array[i] = in.nextInt();
            return array;
        }

        public static String[] readStringArray(Scanner in, int size) {
            String[] array = new String[size];
            for (int i = 0; i < size; i++)
                array[i] = in.nextLine();
            return array;
        }

        public static int[] readLinearIntArray(Scanner in, int size) {
            //in.nextLine();
            String[] arr = in.nextLine().split(" ");
            int[] array = new int[size];
            for (int i = 0; i < size; i++)
                array[i] = Integer.parseInt(arr[i]);
            return array;
        }

        public static int[] readLinearIntArray(BufferedReader in) throws IOException {
            //in.nextLine();
            String[] arr = in.readLine().split(" ");
            int[] array = new int[arr.length];
            for (int i = 0; i < arr.length; i++)
                array[i] = Integer.parseInt(arr[i]);
            return array;
        }

        public static Double[] readLinearDoubleArray(BufferedReader in) throws IOException {
            //in.nextLine();
            String[] arr = in.readLine().split(" ");
            Double[] array = new Double[arr.length];
            for (int i = 0; i < arr.length; i++)
                array[i] = Double.parseDouble(arr[i]);
            return array;
        }

        public static String[] convert(int[] from) {
            String[] to = new String[from.length];
            for (int i = 0; i < to.length; i++) to[i] = String.valueOf(from[i]);
            return to;
        }

        public static int[] convert(String[] from) {
            int[] to = new int[from.length];
            for (int i = 0; i < to.length; i++) to[i] = Integer.parseInt(from[i]);
            return to;
        }

        public static int[][] read2DIntArray(BufferedReader in, int rows, int columns, String seprator) throws IOException {
            int[][] array = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                array[i] = convert(in.readLine().split(seprator));
            }
            return array;
        }

        public static String[][] read2DStringArray(BufferedReader in, int rows, int columns, String seprator) throws IOException {
            String[][] array = new String[rows][columns];
            for (int i = 0; i < rows; i++) {
                array[i] = in.readLine().split(seprator);
            }
            return array;
        }
    }


    static class DEBUG {
        public static void DebugInfo(String disp) {
            System.err.println("DEBUG Info: " + disp);
        }

        public static void DebugVariable(String variable, String value) {
            System.err.println("DEBUG Info: " + variable + " => " + value);
        }


        public static void DebugVariable(String variable, int value) {
            System.err.println("DEBUG Info: " + variable + " => " + value);
        }


        public static void DebugVariable(String variable, long value) {
            System.err.println("DEBUG Info: " + variable + " => " + value);
        }

        public static void DebugArray(int[] value) {
            for (int i = 0; i < value.length; i++) {

                System.err.println("DEBUG Info: " + i + " => " + value[i]);
            }
        }

    }

}