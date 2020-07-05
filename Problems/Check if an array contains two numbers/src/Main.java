import java.util.Scanner;

public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        boolean result = isAdjacent(readArray(), scanner.nextInt(), scanner.nextInt());
        System.out.println(result);
    }

    static int[] readArray() {
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }


    static boolean isAdjacent(int[] arr, int n, int m) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                if (i > 0 && arr[i - 1] == m) { //checks number before
                    return true;
                }
                else if (i < arr.length -1 && arr[i + 1] == m) { //check number after
                    return true;
                }
            }
        }
        return false;
    }

}