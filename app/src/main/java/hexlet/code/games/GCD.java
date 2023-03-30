package hexlet.code.games;
import static hexlet.code.Engine.getMaxround;
import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.randomNumber100;
import static hexlet.code.Engine.setResult;
import static hexlet.code.Engine.getResult;
import static hexlet.code.Engine.setUserResult;
import static hexlet.code.Engine.getUserResult;
import static hexlet.code.Engine.rightResult;
import static hexlet.code.Engine.wrongResultInt;
import static hexlet.code.Engine.getScanner;
public class GCD {
    public static void gcd() {
        greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < getMaxround(); i++) {
            int num1 = randomNumber100();
            int num2 = randomNumber100();
            System.out.println("Question: " + num1 + " " + num2);
            for (int j = num1; j > 0; j--) {
                if (num1 % j == 0 & num2 % j == 0) {
                    setResult(j);
                    break;
                }
            }
            System.out.print("You answer: ");
            setUserResult(Integer.parseInt(getScanner().next()));
            if (getUserResult() == getResult()) {
                rightResult();
            } else {
                wrongResultInt();
                break;
            }
        }
    }
}
