package hexlet.code;
import hexlet.code.games.Calculator;
import hexlet.code.games.GameEven;
import java.util.Scanner;

public class Engine {
    public static Scanner scanner = new Scanner(System.in);
    public static String userName;
    public static int round = 0;
    public static int userResult;
    public static int result;



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
            case (3):
                Calculator.calc();
            default:
                break;
        }
    }

    public static void wrongResult() {
        System.out.println("'" + userResult + "'" + " is wrong answer ;(. Correct answer was "
                + "'" + result + "'" + " Let's try again, " + userName);
    }

    public static void rightResult() {
        System.out.println("Correct!");
        round++;
        if (round == 3) {
            congratulations();
        }
    }

    public static void congratulations() {
        System.out.println("Congratulations, " + userName);
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Engine.userName = Engine.scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static int randomNumber() {
        return (int) (Math.random() * 10);
    }
}

