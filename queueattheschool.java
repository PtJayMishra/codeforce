import java.util.Scanner;

public class queueattheschool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String g = in.next();
            for (int j = k; j >0; j--) {
            g =    g.replace("BG" , "GB");
            }

        System.out.println(g);
            }

        }

