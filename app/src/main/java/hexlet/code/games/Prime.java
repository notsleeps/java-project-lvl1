package hexlet.code.games;
import static hexlet.code.Engine.run;
import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.YES;
import static hexlet.code.Engine.NO;
import hexlet.code.Utils;

public class Prime {
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int ARRAYDEPTH = 2;
    public static final int ARRAYWIDTH = 3;

    public static boolean isPrime(int number) {
        boolean testNumberIsPrime = true;
        if (number <= 1) {
            return false;
        }

        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                testNumberIsPrime = false;
                break;
            }
        }
        return testNumberIsPrime;
    }

    public static void play() {
        String[][] gameData = new String[ARRAYWIDTH][ARRAYDEPTH];
        for (int i = 0; i < MAXROUND; i++) {
            int number = Utils.randomNumber100();
            gameData[i][0] = String.valueOf(number);
            gameData[i][1] = isPrime(number) ? YES : NO;
        }
        run(gameData, TASK);
    }
}
