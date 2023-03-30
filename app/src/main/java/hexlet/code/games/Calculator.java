package hexlet.code.games;
import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.randomNumber100;
import static hexlet.code.Engine.rightResult;
import static hexlet.code.Engine.getScanner;
import static hexlet.code.Engine.getMaxround;
import static hexlet.code.Engine.getResult;
import static hexlet.code.Engine.setResult;
import static hexlet.code.Engine.setUserResult;
import static hexlet.code.Engine.getUserResult;
import static hexlet.code.Engine.wrongResultInt;

public class Calculator {

    public static void calc() {
        greeting();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < getMaxround(); i++) {
            int num1 = randomNumber100();
            int num2 = randomNumber100();
            int symbol = (int) (Math.random() * 3);
            if (symbol == 0) {
                setResult(num1 * num2);
                System.out.println("Question: " + num1 + " * " + num2);
                setUserResult(Integer.parseInt(getScanner().next()));
                if (getResult() == getUserResult()) {
                    rightResult();
                } else {
                    wrongResultInt();
                    break;
                }
            } else if (symbol == 1) {
                setResult(num1 - num2);
                System.out.println("Question: " + num1 + " - " + num2);
                setUserResult(Integer.parseInt(getScanner().next()));
                if (getResult() == getUserResult()) {
                    rightResult();
                } else {
                    wrongResultInt();
                    break;
                }
            } else {
                setResult(num1 + num2);
                System.out.println("Question: " + num1 + " + " + num2);
                setUserResult(Integer.parseInt(getScanner().next()));
                if (getResult() == getUserResult()) {
                    rightResult();
                } else {
                    wrongResultInt();
                    break;
                }
            }
        }
    }
}
