import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xWhite = scanner.nextInt();
        int yWhite = scanner.nextInt();
        int xBlack = scanner.nextInt();
        int yBlack = scanner.nextInt();

        int difX = Math.abs(xWhite - xBlack);
        int difY = Math.abs(yWhite - yBlack);

        if (difX == 0 || difY == 0 || difX == difY) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
