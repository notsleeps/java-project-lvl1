package hexlet.code.games;
import static hexlet.code.Engine.*;
public class Prime {
    public static void primeNumber() {
        greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int num = randomNumber100();
            boolean b = true;
            System.out.println("Question: " + num);
            setUserAnswer(getScanner().next());
            for (int j = 2; j < 20; j++) {
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

    public static void main(String[] args) {
        Prime.primeNumber();
    }
}
