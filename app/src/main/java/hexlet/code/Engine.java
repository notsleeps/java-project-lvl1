package hexlet.code;
import hexlet.code.games.Calculator;
import hexlet.code.games.GameEven;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class Engine {
    public static Scanner scanner = new Scanner(System.in);
    public static String userName;
    public static int userResult;
    public static String userAnswer;
    public static int result;
    public static int round = 0;

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
                break;
            case (4):
                GCD.gcd();
                break;
            case (5):
                Progression.progress();
                break;
            case (6):
                Prime.primeNumber();
                break;
            default:
                break;
        }
    }

    public static void rightResult() {
        System.out.println("Correct!");
        round++;
        if (round == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    public static void wrongResult() {
        System.out.println("'" + userResult + "'" + " is wrong answer ;(. Correct answer was "
                + "'" + result + "'" + " Let's try again, " + userName + "!");
    }

    public static void wrongResultStringYes() {
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'yes'.\n"
                + "Let's try again, " + userName + "!");
    }

    public static void wrongResultStringNo() {
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'no'.\n"
                + "Let's try again, " + userName + "!");
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Engine.userName = Engine.scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static int randomNumber100() {
        return 2 + (int) (Math.random() * 100);
    }
    public static int randomNumber10() {
        return 1 + (int) (Math.random() * 10);
    }
}

