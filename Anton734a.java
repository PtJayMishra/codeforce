import java.util.Arrays;
import java.util.Scanner;

public class Anton734a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a  = 0;
        int d = 0;
        String j = sc.next();
        for (int i = 0; i < n; i++) {
                if (j.charAt(i) == 'A'){
                    a++;

                }else if(j.charAt(i) =='D'){
                    d++;
                }}

            if (a> d){
                System.out.println("Antony");

            }else if(d>a) {
                System.out.println("Danik");
            }else {
                System.out.println("Friendship");
            }

        }
    }
