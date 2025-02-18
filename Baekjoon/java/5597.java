import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[30];
        int [] arr1 = new int [28];

        for(int i = 0; i < 30; i++)
            arr[i] = i+1;

        for(int i = 0; i < 28; i++){
            int n = sc.nextInt();
            arr1[i] = n;
        }

        for(int i = 0; i < 30; i++){
            for(int j = 0; j < 28; j++){
                if(arr[i] == arr1[j])
                    arr[i] = 0;
            }
        }
        for(int i = 0; i < 30; i++){
            if(arr[i] != 0)
                System.out.println(arr[i]);
        }
    }
}
