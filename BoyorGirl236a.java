import java.util.Scanner;

public class BoyorGirl236a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String letter = in.next();
        int length =  letter.length();

          {
            if( length/2 == Math.floor(length) ) {
                System.out.println("CHAT WITH HER");
            } else {
                System.out.println("IGNORE HIM");
            }

        }
    }
}
