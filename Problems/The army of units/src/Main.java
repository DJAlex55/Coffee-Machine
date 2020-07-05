import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        String msg;

        if (units < 1) {
            msg = "no army";
        } else if (units < 20) {
            msg = "pack";
        } else if (units < 250) {
            msg = "throng";
        } else if (units < 1000) {
            msg = "zounds";
        } else {
            msg = "legion";
        }

        System.out.println(msg);


    }
}
