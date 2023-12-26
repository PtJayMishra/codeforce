import java.util.Scanner;

public class gamewithinteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a = 0;
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            if((n%3)!=0){
                System.out.println("First");

            }else {
                System.out.println("Second");
            }

        }
    }
}