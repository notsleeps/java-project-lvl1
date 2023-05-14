package hexlet.code;
import java.util.Scanner;
public class Engine {
    private static  Scanner scanner = new Scanner(System.in);
    public static final String YES = "yes";
    public static final String NO = "no";
    public static final int MAXROUND = 3;
    private static int round = 0;

    public static void run(String[][] data, String task) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(task);
        for (int i = 0; i < MAXROUND; i++) {
            String correctAnswer = data[i][1];
            System.out.println("Question: " + data[i][0]);
            System.out.print("You answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(data[i][1])) {
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
}

