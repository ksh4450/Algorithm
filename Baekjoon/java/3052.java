import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[10];
        int num, count = 0;

        for(int i = 0; i < 10; i++){
            int n = sc.nextInt();
            arr[i] = n % 42;
        }

        for(int i = 0; i < 10   ; i++){
            num = 0;
            for(int j = i + 1; j < 10; j++){
                if(arr[i] == arr[j]){
                    num++;
                }
            }
            if(num == 0)
                count++;
        }
        System.out.println(count);
    }
}
