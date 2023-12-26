import java.util.Scanner;
import java.util.concurrent.Callable;

//THIS IS THE FIRST QUESTION THAT I SOLVE

public class wordcapitalization281a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String capital = sc.next();
         {
            if (Character.isLowerCase(capital.charAt(0)) ) {
                String uppercapital =  capital.substring(0, 1).toUpperCase() + capital.substring(1);
                System.out.println(uppercapital);

            }else  {

                System.out.println(capital);

                }

         }

        }

    }
