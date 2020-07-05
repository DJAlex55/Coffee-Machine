import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int[] box1 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int[] box2 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        Arrays.sort(box1); //we sort from small to big for both arrays
        Arrays.sort(box2);

        //0: equal, 1: boxA, -1: boxB, 99: Incomparable
        int finalComparison = Integer.compare(box1[0], box2[0]);
        for (int i = 1; i < box1.length; i++) {
            int comparison = Integer.compare(box1[i], box2[i]);

            if (finalComparison == comparison || comparison == 0) {
                continue;
            }
            finalComparison = finalComparison == 0 ? comparison : 99;

            if (finalComparison == 99) {
                System.out.println("Incomparable");
                return;
            }
        }
        System.out.println("Box 1 " + (finalComparison == 0 ? "=" : (finalComparison > 0 ? ">" : "<")) + " Box 2");
    }
}