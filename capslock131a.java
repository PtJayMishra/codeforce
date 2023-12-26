//import java.util.Scanner;
//import java.lang.String;
//public class capslock131a {
//    public static void main (String[] args){
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        String ans= "";
//
//        boolean check = true;
//        for(int i=1;i<s.length();i++){
//            if(s.charAt(i)<='Z' && s.charAt(i)>='A'){
//                continue;
//            }else{
//                check = false;
//                break;
//            }
//        }
//        if(check){
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
//                    ans.append((char) (s.charAt(i) + 32));
//                } else {
//                    ans.append((char) (s.charAt(i) - 32));
//                }
//
//
//
//            } System.out.println(ans);
//        }else{
//            System.out.println(s);
//
//    }
//}
//}
//
import java.util.Scanner;

public class capslock131a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        StringBuilder ans = new StringBuilder();
        boolean check = true;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                continue;
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                    ans.append((char) (s.charAt(i) + 32));
                } else {
                    ans.append((char) (s.charAt(i) - 32));
                }
            }
            System.out.println(ans);
        } else {
            System.out.println(s);
        }
    }
}