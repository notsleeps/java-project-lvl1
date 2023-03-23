package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.userName;
import static hexlet.code.Engine.scanner;
import static hexlet.code.Engine.randomNumber;
import static hexlet.code.Engine.rightResult;
public class GameEven {


    public static void even() {
        String yes = "yes";
        String no = "no";
        Engine.greeting();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            int num = randomNumber();
            System.out.println("Question: " + num);
            String answer = scanner.next();
            if ((num % 2 == 0 & answer.equals(yes)) || (num % 2 != 0 & answer.equals(no))) {
                rightResult();
            } else if (num % 2 == 0 & !answer.equals(yes)) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.\n"
                        + "Let's try again, " + userName);
                break;
            } else if (num % 2 != 0 & !answer.equals(no)) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again, " + userName);
                break;
            }
        }
    }
}
