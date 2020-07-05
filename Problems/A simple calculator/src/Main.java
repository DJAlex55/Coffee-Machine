import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        long num1 = scanner.nextLong();
        String operation = scanner.next();
        long num2 = scanner.nextLong();

        long result;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by 0!");
                    return;
                }
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                System.out.println("Unknown operator");
                return;
        }

        System.out.println(result);

    }
}