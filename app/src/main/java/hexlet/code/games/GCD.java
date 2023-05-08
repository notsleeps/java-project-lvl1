package hexlet.code.games;
import static hexlet.code.Engine.run;
import static hexlet.code.Engine.MAXROUND;
import hexlet.code.Utils;

public class GCD {
    private static final String TASK = "Find the greatest common divisor of given numbers.";
    public static final int ARRAYDEPTH = 2;
    public static final int ARRAYWIDTH = 3;

    public static int divide(int number1, int number2) {
        int result = 0;
        for (int j = number1; j > 0; j--) {
            if (number1 % j == 0 & number2 % j == 0) {
                result = j;
                break;
            }
        }
        return result;
    }

    public static void play() {

        String[][] gameData = new String[ARRAYWIDTH][ARRAYDEPTH];
        for (int i = 0; i < MAXROUND; i++) {
            int numberA = Utils.randomNumber100();
            int numberB = Utils.randomNumber100();
            gameData[i][0] = numberA + " " + numberB;
            gameData[i][1] = String.valueOf(divide(numberA, numberB));
        }
        run(gameData, TASK);
    }
}
