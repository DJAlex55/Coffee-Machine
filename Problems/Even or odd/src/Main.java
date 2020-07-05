import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        while ( (num = scanner.nextInt()) != 0){
            System.out.println( num % 2 == 0 ? "even" : "odd");
        }
    }
}