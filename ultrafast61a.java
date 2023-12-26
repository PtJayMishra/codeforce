import java.util.Scanner;
public class ultrafast61a{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        String y=sc.next();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==y.charAt(i)){
                System.out.print("0");
            }else{
                System.out.print("1");
            }
        }
    }
}