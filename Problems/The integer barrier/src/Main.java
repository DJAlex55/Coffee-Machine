import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        int sum = 0;
        while ((input = scanner.nextInt()) != 0) {
            sum += input;

            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }

        System.out.println(sum);
    }
}
