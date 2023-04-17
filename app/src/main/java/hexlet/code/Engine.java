package hexlet.code;
import java.util.Scanner;
public class Engine {
    private static  Scanner scanner = new Scanner(System.in);
    public static int randomNumber100() {
        final int randomNumberFrom2 = 2;
        final int randomNumberTo100 = 100;
        return randomNumberFrom2 + (int) (Math.random() * randomNumberTo100);
    }
    public static int randomNumber10() {
        final int randomNumberFrom1 = 1;
        final int randomNumberTo10 = 10;
        return randomNumberFrom1 + (int) (Math.random() * randomNumberTo10);
    }
    private static String userName;
    public static final String YES = "yes";
    public static final String NO = "no";
    public static final int MAXROUND = 3;
    private static int round = 0;

    public static void run(String[][] array, String str) {
        greeting();
        System.out.println(str);
        for (int i = 0; i < MAXROUND; i++) {
            String correctAnswer = array[i][1];
            System.out.println("Question: " + array[i][0]);
            System.out.print("You answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(array[i][1])) {
                System.out.println("Correct!");
                round++;
                if (round == MAXROUND) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'" + " Let's try again, " + userName + "!");
                break;
            }
        }
    }
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Engine.userName = Engine.scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}

