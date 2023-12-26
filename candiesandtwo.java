import java.util.Scanner;

public class candiesandtwo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            if (t==1){
                System.out.println("0");
            } else if (t==2) {
                System.out.println("0");

            }else if (t%2==0){
                System.out.println((t/2)-1);
            }
            else {
                System.out.println((t/2));
            }
        }

        }
}
