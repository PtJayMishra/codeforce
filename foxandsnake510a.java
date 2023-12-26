import java.util.Scanner;

public class foxandsnake510a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String ni = "#";
        String  no = ".";
        for (int i = 0; i < n; i++) {
                if (n%2==0){
                    for (int j = 0; j <m ; j++) {
                    System.out.println(ni);
                }
            }else {
                    for (int j = 0; j < m; j++) {
                        if ((j == 0) && (i % 4 == 3)){
                            System.out.println(n);
                        }
                    }
                }
        }
    }
}
