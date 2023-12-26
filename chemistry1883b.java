import java.util.Scanner;

public class chemistry1883b {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            String s = in.next();
            int [] arr = new int[26];
            for (int j = 0; j < n; j++) {
               arr[s.charAt(j) - 'a']++;
            }
            int o = 0;
            for (int j = 0; j < 26; j++) {
                if(arr[j]%2 != 0)
                    o++;
            }if (o <= k+1){
                System.out.println("yes");

                } else {
                System.out.println("no");

                }
            }

        }
    }
//            if(s.length() == 1){
//                System.out.println("Yes");
//            }else{
//                for (int j = 0; j <s.length() ; j++) {
//                if(s.charAt(j) == s.charAt(j+1) && k==0){
//                    System.out.println("Yes");
//                }else if(s.charAt(j) == s.charAt(j+2) && k ==0){
//                    System.out.println("Yes");
//                } else{
//                    if (s.length() - k != 0 ){
//                        String g = s.replace("" , "")
//
//                        System.out.println("Yes");
//
//                  }
