import java.util.Scanner;

public class yetnother {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            String s = in.next();
            for (int j = 0; j < s.length(); j++) {
                if (s.contains("b")) {
                    System.out.println(s.replaceFirst("[a-z]" ,""));

                }if (s.contains("B")){
                    System.out.println(s.replaceFirst("[A-Z]",""));
                }
            }
        }
    }
}
