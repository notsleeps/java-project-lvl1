package hexlet.code.games;
import static hexlet.code.Engine.*;

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
