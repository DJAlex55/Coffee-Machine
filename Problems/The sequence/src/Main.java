import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        
        int maxNum = 0;
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number % 4 == 0 && maxNum < number) {
                maxNum = number;
            }
        }

        System.out.println(maxNum);

    }
}
