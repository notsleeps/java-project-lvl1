package hexlet.code.games;
import static hexlet.code.Engine.run;
import static hexlet.code.Engine.MAXROUND;
import hexlet.code.Engine;

public class GCD {
    private static int numberA1 = 1 + Engine.randomNumber100();
    private static final int NUMBER_A2 = 1 + Engine.randomNumber100();
    private static final int NUMBER_A3 = 1 + Engine.randomNumber100();
    private static int numberB1 = 1 + Engine.randomNumber100();
    private static final int NUMBER_B2 = 1 + Engine.randomNumber100();
    private static final int NUMBER_B3 = 1 + Engine.randomNumber100();
    static final String EXERCISE = "Find the greatest common divisor of given numbers.";
    public static String[][] queANDans = {{null, null}, {null, null}, {null, null}};

    public static void gcdPlay() {
        for (int i = 0; i < MAXROUND; i++) {
            int num1 = numberA1;
            int num2 = numberB1;
            String result = num1 + " " + num2;
            queANDans[i][0] = result;
            for (int j = num1; j > 0; j--) {
                if (num1 % j == 0 & num2 % j == 0) {
                    queANDans[i][1] = String.valueOf(j);
                    break;
                }
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
