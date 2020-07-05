import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int move = scanner.nextInt();
        String msg;

        switch (move){
            case 1:
                msg = "You have chosen a square";
                break;
            case 2:
                msg = "You have chosen a circle";
                break;
            case 3:
                msg = "You have chosen a triangle";
                break;
            case 4:
                msg = "You have chosen a rhombus";
                break;
            default:
                msg = "There is no such shape!";
        }

        System.out.println(msg);

    }
}