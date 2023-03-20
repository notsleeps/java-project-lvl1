package hexlet.code;

import java.util.Scanner;

public class App {

    public static void menu(int num) {
        switch (num) {
            case (0):
                break;
            case (1):
                Cli.greeting();
                break;
            case (2):
                GameEven.even();
                break;
            default:
                break;
        }
    }


    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
        menu(number);


    }
}
