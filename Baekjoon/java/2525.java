import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(b + c >= 60){
            if((b + c) % 60 == 0){
                if(a + (b + c) / 60 >= 24){
                    System.out.println((a + (b + c) / 60) % 24 + " " + 0);
                }else{
                    System.out.println(a + (b + c) / 60 + " " + 0);
                }
            }else{
                if(a + (b + c) / 60 >= 24){
                    System.out.println((a + (b + c) / 60) % 24 + " " + (b + c) % 60);
                }else {
                    System.out.println(a + (b + c) / 60 + " " + (b + c) % 60);
                }
            }
        }else {
            System.out.println(a + " " + (b + c));
        }
    }
}
