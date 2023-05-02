package hexlet.code.games;
import static hexlet.code.Engine.run;
import static hexlet.code.Engine.MAXROUND;
import hexlet.code.Utils;

public class GCD {
    private static final String TASK = "Find the greatest common divisor of given numbers.";
    public static int gcdLogic(int number1, int number2) {
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
        String[][] gameData = new String[3][2];
        for (int i = 0; i < MAXROUND; i++) {
            int numberA = 1 + Utils.randomNumber100();
            int numberB = 1 + Utils.randomNumber100();
            String result = numberA + " " + numberB;
            gameData[i][0] = result;
            gameData[i][1] = String.valueOf(gcdLogic(numberA, numberB));
        }
        run(gameData, TASK);
    }
}
