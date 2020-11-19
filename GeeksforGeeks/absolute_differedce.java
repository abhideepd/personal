package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class absolute_differedce 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=1;
        t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            String input2[]=(x.readLine()).split(" ");
            driver(input1, input2);
            //test();
        }
    }
    static void test()
    {
        String input1_1[]=("5 7").split(" ");
        String input2_1[]=("10 5 3 9 2").split(" ");
        driver(input1_1, input2_1);

        String input1_2[]=("5 6").split(" ");
        String input2_2[]=("1 2 3 4 5").split(" ");
        driver(input1_2, input2_2);

        String input1_3[]=("4 5").split(" ");
        String input2_3[]=("2 6 8 3").split(" ");
        driver(input1_3, input2_3);

        String input1_4[]=("4 5").split(" ");
        String input2_4[]=("2 6 8 3 2 8").split(" ");
        driver(input1_4, input2_4);

        String input1_5[]=("4 5").split(" ");
        String input2_5[]=("2 6 8 3 2").split(" ");
        driver(input1_5, input2_5);

        String input1_6[]=("4 5").split(" ");
        String input2_6[]=("2 6 8 3 8").split(" ");
        driver(input1_6, input2_6);

        String input1_7[]=("384 386").split(" ");
        String input2_7[]=("778 916 794 336 387 493 650 422 363 28 691 60 764 927 541 427 173 737 212 369 568 430 783 531 863 124 68 136 930 803 23 59 70 168 394 457 12 43 230 374 920 785 538 199 325 316 371 414 527 92 981 957 874 171 997 282 306 926 85 328 337 506 847 730 314 858 125 896 583 546 815 368 435 365 44 751 88 809 277 179 789 585 404 652 755 400 933 61 677 740 13 227 587 95 540 796 571 379 468 602 98 903 318 653 757 302 281 287 442 866 690 445 620 441 32 118 772 482 676 710 928 857 498 354 966 307 684 220 625 529 872 733 830 504 20 271 709 716 341 150 797 724 619 246 452 922 556 380 489 765 229 842 351 194 501 35 915 988 744 492 228 366 860 937 433 552 438 276 408 475 122 859 396 30 238 236 819 429 144 929 530 777 405 444 614 539 607 841 905 129 689 370 918 471 184 491 500 773 726 645 591 140 955 787 670 83 543 465 198 508 356 805 349 612 623 829 300 344 747 569 423 312 811 606 802 662 731 879 321 627 523 466 417 283 259 925 638 63 601 37 453 900 551 469 72 974 132 882 931 934 895 661 164 200").split(" ");
        driver(input1_7, input2_7);
    }
    static void driver(String []input1, String []input2)
    {
            int arr[]=new int[input2.length];

            int abs=Integer.parseInt(input1[1]);    //absolute difference

            for(int i=0; i<input2.length; i++)
            arr[i]=Integer.parseInt(input2[i]);

            int abs_diff_arr[]=new int[input2.length];

            for(int i=0; i<input2.length; i++)
            abs_diff_arr[i]=Math.abs(arr[i]-abs);

            /*
            System.out.println();//--test
            System.out.println("Input:  k = "+abs);//--test
            System.out.print("Array: ");//--test
            print(arr);//--test
            System.out.print("Difference Array: ");//--test
            print(abs_diff_arr);//--test
            sort(arr, abs_diff_arr, 0, arr.length-1);
            System.out.println("----------------------");
            System.out.println("Output: "); //--test
            System.out.print("Array: ");//--test
            print(arr);//--test
            System.out.print("Difference Array: ");//--test
            print(abs_diff_arr);   //-- test
            */

            sort(arr, abs_diff_arr, 0, arr.length-1);//--Finale
            print(arr);//--Finale
    }

    static void sort(int []arr, int []abs_diff_arr, int l, int r)
    {
        int mid=(l+r)/2;
        if(l<r)
        {
            sort(arr, abs_diff_arr, l, mid);
            sort(arr, abs_diff_arr, mid+1, r);
            merge(arr, abs_diff_arr, l, mid, r);
        }
    }

    static void merge(int []arr, int []abs_diff_arr, int l, int mid, int r)
    {
        int size_L=mid-l+1;
        int size_R=r-mid;
        int L_abs_diff_arr[]=new int[size_L];
        int L_arr[]=new int[size_L];
        int R_arr[]=new int[size_R];
        int R_abs_diff_arr[]=new int[size_R];

        //transfer values in array
        int k=l;
        for(int i=0; i<size_L; i++)
        {
            L_abs_diff_arr[i]=abs_diff_arr[k];
            L_arr[i]=arr[k];
            k++;
        }

        for(int i=0; i<size_R; i++)
        {
            R_abs_diff_arr[i]=abs_diff_arr[k];
            R_arr[i]=arr[k];
            k++;
        }

        int L_count=0;
        int R_count=0;
        int i=l;

        while((L_count<size_L)&&(R_count<size_R))
        {
            if(L_abs_diff_arr[L_count]<=R_abs_diff_arr[R_count])
            {
                abs_diff_arr[i]=L_abs_diff_arr[L_count];
                arr[i]=L_arr[L_count];
                i++;
                L_count++;
            }
            else
            {
                abs_diff_arr[i]=R_abs_diff_arr[R_count];
                arr[i]=R_arr[R_count];
                i++;
                R_count++;
            }
        }

        for(; L_count<size_L; L_count++)
        {
            abs_diff_arr[i]=L_abs_diff_arr[L_count];
            arr[i]=L_arr[L_count];
            i++;
        }

        for(; R_count<size_R; R_count++)
        {
            abs_diff_arr[i]=R_abs_diff_arr[R_count];
            arr[i]=R_arr[R_count];
            i++;
        }
    }

    static void print(int []arr)
    {
        StringBuilder output=new StringBuilder();
        for(int i=0; i<arr.length; i++)
        output.append(arr[i]+" ");
        System.out.println(output);
    }
}