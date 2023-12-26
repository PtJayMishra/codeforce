import java.util.Scanner;

public class Insearch1030a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        for (int i = 0; i <n ; i++) {
            a = in.nextInt();

        } if (a == 0 || a == 1 ){
            System.out.println("hard");
        }else if (a == 0){
            System.out.println("easy");
        }
    }
}
