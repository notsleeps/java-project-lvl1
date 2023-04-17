package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.run;
import static hexlet.code.Engine.queANDans;

public class Calculator {
    private static int numberA1 = 1 + Engine.randomNumber10();
    private static final int NUMBER_A2 = 1 + Engine.randomNumber10();
    private static final int NUMBER_A3 = 1 + Engine.randomNumber10();
    private static int numberB1 = 1 + Engine.randomNumber100();
    private static final int NUMBER_B2 = 1 + Engine.randomNumber10();
    private static final int NUMBER_B3 = 1 + Engine.randomNumber10();

    static final String EXERCISE = "What is the result of the expression?";
    public static void calcPlay() {
        for (int i = 0; i < MAXROUND; i++) {
            int num1 = numberA1;
            int num2 = numberB1;
            final int numberOfOperation = 3;
            int symbol = (int) (Math.random() * numberOfOperation);
            if (symbol == 0) {
                int result = num1 * num2;
                queANDans[i][0] = num1 + " * " + num2;
                queANDans[i][1] = String.valueOf(result);

            } else if (symbol == 1) {
                int result = num1 - num2;
                queANDans[i][0] = num1 + " - " + num2;
                queANDans[i][1] = String.valueOf(result);

            } else {
                int result = num1 + num2;
                queANDans[i][0] = num1 + " + " + num2;
                queANDans[i][1] = String.valueOf(result);
            }
            if (i == 0) {
                numberA1 = NUMBER_A2;
                numberB1 = NUMBER_B2;
            } else {
                numberA1 = NUMBER_A3;
                numberB1 = NUMBER_B3;
            }
        }
        run(queANDans, EXERCISE);
    }
}
