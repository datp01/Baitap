import java.util.Scanner;
public class tt77 {
    public static void show(int[] arr) {
        for (int j : arr) {
            if (j % 3 == 0 && j % 5 != 0) {
                System.out.print(j + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        show(arr);
    }
}
