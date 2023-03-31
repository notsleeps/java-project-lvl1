package hexlet.code;
import hexlet.code.games.Calculator;
import hexlet.code.games.GameEven;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class Engine {
    private static Scanner scanner = new Scanner(System.in);
    public static Scanner getScanner() {
        return scanner;
    }

    private static String userName;
    public static void setUserName(String str) {
        userName = str;
    }
    public static String getUserName() {
        return userName;
    }
    private static int userResult;
    public static void setUserResult(int i) {
        userResult = i;
    }
    public static int getUserResult() {
        return userResult;
    }

    private static String userAnswer;
    public static void setUserAnswer(String str) {
        userAnswer = str;
    }
    public static String getUserAnswer() {
        return userAnswer;
    }
    private static int result;
    public static int getResult() {
        return result;
    }
    public static void setResult(int i) {
        result = i;
    }


    private static int round = 0;

    public static int getMaxround() {
       final int maxround = 3;
        return maxround;
    }

    private static final int GREETING = 1;
    private static final int PARITY = 2;
    private static final int GAMECALCULATOR = 3;
    private static final int GAMEGCD = 4;
    private static final int GAMEPROGRESSION = 5;
    private static final int GAMEPRIMENUMBER = 6;


    public static void menu(int num) {
        switch (num) {
            case GREETING -> Cli.greeting();
            case PARITY -> GameEven.even();
            case GAMECALCULATOR -> Calculator.calc();
            case GAMEGCD -> GCD.gcd();
            case GAMEPROGRESSION -> Progression.progress();
            case GAMEPRIMENUMBER -> Prime.primeNumber();
            default -> {
            }
        }
    }

    public static void rightResult() {
        System.out.println("Correct!");
        round++;
        if (round == getMaxround()) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    public static void wrongResultInt() {
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
        int randomNumberFrom_2 = 2;
        int randomNumberTo_100 = 100;
        return randomNumberFrom_2 + (int) (Math.random() * randomNumberTo_100);
    }
    public static int randomNumber10() {
        int randomNumberFrom_1 = 1;
        int randomNumberTo_10 = 10;
        return randomNumberFrom_1 + (int) (Math.random() * randomNumberTo_10);
    }
}

