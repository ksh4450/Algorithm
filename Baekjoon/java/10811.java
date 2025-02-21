import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int [n];
        int temp;

        for(int a = 0; a < n; a++)
            arr[a] = a + 1;

        for(int a = 0; a < m; a++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            for(int b = i - 1; b <= j - 1; b++){
                temp = arr[b];
                arr[b] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        for(int a = 0; a < n; a++)
            System.out.print(arr[a] + " ");
    }
}
