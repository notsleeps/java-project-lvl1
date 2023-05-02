package hexlet.code.games;
import static hexlet.code.Engine.run;
import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.YES;
import static hexlet.code.Engine.NO;
import hexlet.code.Utils;

public class Prime {
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean primeLogic(int number) {
        boolean b = true;
        final int maxDivisor = 20;
        for (int j = 2; j < maxDivisor; j++) {
            if (j == number) {
                j++;
            }
            if (number % j == 0) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static void play() {
        final int arrayDepth = 2;
        final int arrayWidth = 3;
        String[][] gameData = new String[arrayWidth][arrayDepth];
        for (int i = 0; i < MAXROUND; i++) {
            int question = 1 + Utils.randomNumber100();
            gameData[i][0] = String.valueOf(question);
            if (primeLogic(question)) {
                gameData[i][1] = YES;
            } else {
                gameData[i][1] = NO;
            }
        }
        run(gameData, TASK);
    }
}
