package hexlet.code.games;
import static hexlet.code.Engine.scanner;
import static hexlet.code.Engine.randomNumber100;
import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.rightResult;
import static hexlet.code.Engine.userAnswer;
import static hexlet.code.Engine.wrongResultStringNo;
import static hexlet.code.Engine.wrongResultStringYes;

public class Prime {

    public static void primeNumber() {
        greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int num = randomNumber100();
            boolean b = true;
            System.out.println("Question: " + num);
            userAnswer = scanner.next();
            for (int j = 2; j < 20; j++) {
                if (j == num) {
                    j++;
                }
                if (num % j == 0) {
                    b = false;
                    break;
                }
            }
            if (!b && userAnswer.equals("no") || b && userAnswer.equals("yes")) {
                rightResult();
            } else if (!b && userAnswer.equals("yes")) {
                wrongResultStringNo();
                break;
            } else {
                wrongResultStringYes();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Prime.primeNumber();
    }
}
