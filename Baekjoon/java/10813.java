import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];


        for(int a = 0; a < n; a++)
            arr[a] = a + 1;

        for(int a = 0; a < m; a++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int temp = 0;

            temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;

        }

        for(int a = 0; a < n; a++)
            System.out.print(arr[a] + " ");
    }
}
