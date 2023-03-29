package hexlet.code.games;

import static hexlet.code.Engine.scanner;
import static hexlet.code.Engine.randomNumber100;
import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.result;
import static hexlet.code.Engine.userResult;
import static hexlet.code.Engine.rightResult;
import static hexlet.code.Engine.wrongResult;

public class GCD {

    public static void gcd() {
        greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            int num1 = randomNumber100();
            int num2 = randomNumber100();
            System.out.println("Question: " + num1 + " " + num2);
            for (int j = num1; j > 0; j--) {
                if (num1 % j == 0 & num2 % j == 0) {
                    result = j;
                    break;
                }
            }
            System.out.print("You answer: ");
            userResult = Integer.parseInt(scanner.next());
            if (result == userResult) {
                rightResult();
            } else {
                wrongResult();
                break;
            }
        }
    }
}
