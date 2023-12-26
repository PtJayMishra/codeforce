import java.util.Scanner;

public class football96a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if (s.contains("1111111")) {
            System.out.println("YES");
        } else if (s.contains("0000000")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }}