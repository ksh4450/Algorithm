import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []arr = new int[9];
        int max = 0, count = 0;

        for (int i = 0; i < 9; i++)
            arr[i] = sc.nextInt();

        for(int j = 0; j < 9; j++) {
            if(arr[j] >= max)
                max = arr[j];
        }

        for(int k = 0; k < 9; k++){
            count++;
            if(arr[k] == max)
                break;
        }

        System.out.println(max);
        System.out.println(count);
    }
}
