import java.util.Scanner;
public class tt76 {
    public static int sumOfArray(int[] arr) {
        int answer = 0;
        for (int j : arr) {
            answer += j;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(sumOfArray(arr));
    }
}
