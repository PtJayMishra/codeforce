import java.util.Scanner;

public class game268a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 0;
        int[] h = new int[n];
        int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
                h[j] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                if (h[i] == a[j]){
                    m++;
                }
        }
    }
        System.out.println(m++);
    }
}
