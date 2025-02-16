import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];

        for(int a = 0; a < n; a++)
            arr[a] = 0;

        for(int a = 0; a < m; a++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int b = i - 1; b <= j - 1; b++)
                arr[b] = k;

        }

        for(int a = 0; a < n; a++)
            System.out.print(arr[a] + " ");
    }
}
