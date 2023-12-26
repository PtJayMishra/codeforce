import java.util.Scanner;

public class quest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
                    int[] a = new int[n];
            int [] b = new int[n];
            for (int j = 0; j <n ; j++) {
                a[j] = in.nextInt();
                b[j] = in.nextInt();
            }if (k==0){
                System.out.println("0");
            }else {
                if (k>0){
                    for (int j = 0; j < k; j++) {
                        if (a[j+1]> b[j]){


                        } else if (a[j+1] < b[j]){
                            System.out.println(a[j] + b[j]);
                        }
                        }
                    }
                }
            }
        }

        }

