import java.util.Scanner;

public class word59A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String g = in.next();
        int a = 0;
        int b = 0;
        for (int i = 0; i < g.length(); i++) {

            char c = g.charAt(i);
            if (Character.isUpperCase(c)) {
                a++;
            } else {
                b++;
            }
        }
        if (a++ < b++) {
            System.out.println(g.toUpperCase());
        } else {
            System.out.println(g.toLowerCase());
        }
    }}
//           if ( g.matches("[a-z]")){
//               a++;
//
//           }
//
//            else if (g.matches("[A-Z]")){
//               b++;
//           }