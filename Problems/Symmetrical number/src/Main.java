import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int baseNumber = scanner.nextInt();

        int leftDigits = baseNumber / 100; //5692 -> 56

        //5692 -> 2*10 + 92/10 -> 29
        int rightDigits = (baseNumber % 10 * 10) + (baseNumber % 100 / 10);

        if (leftDigits == rightDigits) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }



    }
}
