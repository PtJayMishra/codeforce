import java.util.Scanner;

public class hq9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.next();
        if (line.contains("H") || line.contains("Q")|| line.contains("9") ){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
