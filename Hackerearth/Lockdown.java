package Hackerearth;
import java.io.*;
import java.util.*;
public class Lockdown {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(x.readLine());
        String song=(x.readLine());
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=1; i<=N; i++)
        arr.add(i);
        answer(arr, song, 0, 0);
    }
    static void answer(ArrayList<Integer> arr, String song, int song_index, int arr_index)
    {
        if(arr.size()==1)
        {
            System.out.println(arr.get(0));
            return;
        }

        if(song_index==song.length())
        song_index=0;

        if(arr_index>=arr.size())
        arr_index=0;

        if(song.charAt(song_index)=='y')
        {
            arr.remove(arr_index);
            answer(arr, song, ++song_index, arr_index);
        }
        else
        answer(arr, song, ++song_index, ++arr_index);
    }
}
