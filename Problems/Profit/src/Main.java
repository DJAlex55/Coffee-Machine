import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextInt();
        int percentage = scanner.nextInt();
        double goal = scanner.nextInt();

        int yearsPassed = 0;
        while (money < goal) {

            money += money * percentage / 100d;

            yearsPassed++;
        }

        System.out.println(yearsPassed);


    }
}