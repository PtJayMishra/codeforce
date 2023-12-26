import java.util.Scanner;

public class buttons268b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 0;
        for (int i = 1; i <n+1 ; i++) {
            m+= (n-i)*i;
        }
        System.out.println(m+n);
    }
}
