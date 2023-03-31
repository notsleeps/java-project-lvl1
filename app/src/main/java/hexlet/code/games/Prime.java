package hexlet.code.games;
import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.randomNumber100;
import static hexlet.code.Engine.wrongResultStringNo;
import static hexlet.code.Engine.wrongResultStringYes;
import static hexlet.code.Engine.setUserAnswer;
import static hexlet.code.Engine.getUserAnswer;
import static hexlet.code.Engine.rightResult;
import static hexlet.code.Engine.getScanner;
import static hexlet.code.Engine.getMaxround;
public class Prime {
    public static void primeNumber() {
        greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < getMaxround(); i++) {
            int num = randomNumber100();
            boolean b = true;
            int maxDivisor = 20;
            System.out.println("Question: " + num);
            setUserAnswer(getScanner().next());
            for (int j = 2; j < maxDivisor; j++) {
                if (j == num) {
                    j++;
                }
                if (num % j == 0) {
                    b = false;
                    break;
                }
            }
            if (!b && getUserAnswer().equals("no") || b && getUserAnswer().equals("yes")) {
                rightResult();
            } else if (!b && getUserAnswer().equals("yes")) {
                wrongResultStringNo();
                break;
            } else {
                wrongResultStringYes();
                break;
            }
        }
    }
}
