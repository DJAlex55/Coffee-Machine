import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int i = 1; ; i++) {
            int sqr = i * i;
            if (sqr > n) {
                break;
            }

            System.out.println(sqr);
        }
    }
}