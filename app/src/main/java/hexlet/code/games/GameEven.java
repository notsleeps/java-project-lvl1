package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.scanner;
import static hexlet.code.Engine.randomNumber100;
import static hexlet.code.Engine.rightResult;
import static hexlet.code.Engine.wrongResultStringYes;
import static hexlet.code.Engine.wrongResultStringNo;
import static hexlet.code.Engine.userAnswer;
public class GameEven {


    public static void even() {
        String yes = "yes";
        String no = "no";
        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            int num = randomNumber100();
            System.out.println("Question: " + num);
            userAnswer = scanner.next();
            if ((num % 2 == 0 & userAnswer.equals(yes)) || (num % 2 != 0 & userAnswer.equals(no))) {
                rightResult();
            } else if (num % 2 == 0 & !userAnswer.equals(yes)) {
                wrongResultStringYes();
                break;
            } else {
                wrongResultStringNo();
                break;
            }
        }
    }

    public static void main(String[] args) {
        even();
    }
}
