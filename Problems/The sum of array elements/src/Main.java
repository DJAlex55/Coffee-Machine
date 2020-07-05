import java.util.Scanner;

public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int sum = getSum(ReadArray());

        System.out.println(sum);
    }

    static int[] ReadArray() {
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }


    static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
             sum += num;
        }
        return sum;
    }

}