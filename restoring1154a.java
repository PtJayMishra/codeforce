import java.util.Arrays;
import java.util.Scanner;

public class restoring1154a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1= in.nextInt();
        int x2= in.nextInt();
        int x3= in.nextInt();
        int x4= in.nextInt();
        int [] arr =  new int[3];
boolean t = true;

      if(   x1 ==arr[0] + arr[1]&& x2 == arr[1] + arr[2]&& x3 ==arr[0] + arr[2]&&x4 == arr[1] + arr[0] + arr[2] ){


        for (int i = 0; i < arr.length ; i++) {

            System.out.println(arr[i]);

        }


    }
}}
