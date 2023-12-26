import java.util.Scanner;

public class stick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a = 0;
        for (int i = 0; i < t; i++) {
            long n = in.nextLong();
        if (n%2==0){
            System.out.println((n/2));
        }else {
            System.out.println((n+1)/2);
        }
    }
}}
