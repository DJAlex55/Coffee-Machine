import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int nBridges = scanner.nextInt();

        for (int i = 0; i < nBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (height >= bridgeHeight) {
                System.out.println("Will crash on bridge " + (i+1));
                return;
            }
        }
        System.out.println("Will not crash");

    }
}