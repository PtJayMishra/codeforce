import java.util.Scanner;

public class coverinwater1900a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a = 0;
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            String s = in.next();
            if (s.contains("...")) {
                System.out.println("2");
            } else {
                for (int j = 0; j < s.length(); i++) {
                    if (s.charAt(j) == '.') {
                        a++;
                    }

                }


            }
        }
    }}
