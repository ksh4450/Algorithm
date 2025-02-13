import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {  //hasNextInt() 의 경우 입력값이 정수일경우 true를 반환 아닐경우 입력을 받지않고 false 반환
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a + b);
        }

    }
}
