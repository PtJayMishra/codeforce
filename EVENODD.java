import java.util.Scanner;

public class EVENODD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a = 0;
        if (n%2==0){
            a = 1 +(n-1)*2;
        }
    }
}
