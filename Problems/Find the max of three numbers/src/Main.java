import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {

        //return a >= b ? (a >= c ? 1 : 3) : (b >= c ? 2 : 3);

        int max = a;
        int index = 1;
        if (b > max) {
            index = 2;
            max = b;
        } if (c > max) {
            index = 3;
        }

        return index;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}