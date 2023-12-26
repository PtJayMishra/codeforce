import java.util.Scanner;

public class pangram520a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String g = in.next();
        for (int i = 0; i <g.length() ; i++) {

        }

        if (g.matches("a-z") || g.matches("A-Z")){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }}
}
