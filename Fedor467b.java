import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Fedor467b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        int k = in.nextInt();
        int c= 0;
        for (int i = 0; i <m+1 ; i++) {
            int x = in.nextInt();
            if((m+1)-x <k){
                c = c+1;
            }

        }
        System.out.println(c);
    }
}
