import java.util.Scanner;

public class ratingincrease {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();

            for (int j = 0; j < s.length(); j++) {
                String[] parts = s.split("j");
                String parts1 = parts[0];
                String parts2 = parts[0];
                if (s.charAt(j) != 0) {
                    if (s.charAt(j + 1) != 0) {
                    }
                          if (parts1.compareTo(parts2) < 1) {
                    System.out.println(parts1 + "" + parts2);
                } else {
                    System.out.println("-1");
                    }

                }

            }
        }
    }
}
