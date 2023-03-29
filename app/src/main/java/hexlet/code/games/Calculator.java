package hexlet.code.games;
import static hexlet.code.Engine.scanner;
import static hexlet.code.Engine.randomNumber100;
import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.result;
import static hexlet.code.Engine.userResult;
import static hexlet.code.Engine.rightResult;
import static hexlet.code.Engine.wrongResult;

public class Calculator {

    public static void calc() {
        greeting();

        for (int i = 0; i < 3; i++) {
            int num1 = randomNumber100();
            int num2 = randomNumber100();
            int symbol = (int) (Math.random() * 3);
            if (symbol == 0) {
                result = num1 * num2;
                System.out.println(num1 + " * " + num2);
                userResult = Integer.parseInt(scanner.next());
                if (result == userResult) {
                    rightResult();
                } else {
                    wrongResult();
                    break;
                }
            } else if (symbol == 1) {
                result = num1 - num2;
                System.out.println(num1 + " - " + num2);
                userResult = Integer.parseInt(scanner.next());
                if (result == userResult) {
                    rightResult();
                } else {
                    wrongResult();
                    break;
                }
            } else {
                result = num1 + num2;
                System.out.println(num1 + " + " + num2);
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
}
