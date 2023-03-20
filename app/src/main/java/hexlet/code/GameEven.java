package hexlet.code;
import java.util.Scanner;

public class GameEven {

    public static void even() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        String yes = "yes";
        String no = "no";
        int sum = 0;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            System.out.println("Question: " + randomNumber);
            String answer = scanner.next();
            if ((randomNumber % 2 == 0 & answer.equals(yes)) || (randomNumber % 2 != 0 & answer.equals(no))) {
                System.out.println("Correct!");
                randomNumber = (int) (Math.random() * 100);
                sum++; }
            else if (randomNumber % 2 == 0 & !answer.equals(yes)) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.\n"
                        + "Let's try again, " + userName);
                break; }
            else if (randomNumber % 2 != 0 & !answer.equals(no)) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again, " + userName);
                break; }

            if (sum > 2) {
                System.out.println("Congratulations," + userName + "!");
            }
        }
    }
}
