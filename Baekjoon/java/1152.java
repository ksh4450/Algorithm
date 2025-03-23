import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();  // 앞뒤 공백 제거

        if(str.isEmpty()) {
            System.out.println(0);
            return;
        }

        int n = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                n++;
            }
        }

        System.out.println(n);  
    }
}
