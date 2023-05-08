package hexlet.code.games;
import hexlet.code.Utils;
import static hexlet.code.Engine.run;
import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.YES;
import static hexlet.code.Engine.NO;
public class Even {
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int ARRAYDEPTH = 2;
    public static final int ARRAYWIDTH = 3;
    public static boolean isEven(int number) {
        return  (number % 2 == 0);
    }
    public static void play() {
        String[][] gameData = new String[ARRAYWIDTH][ARRAYDEPTH];
        for (int i = 0; i < MAXROUND; i++) {
            int number = Utils.randomNumber100();
            gameData[i][0] = String.valueOf(number);
            gameData[i][1] = isEven(number) ? YES : NO;
        }
        run(gameData, TASK);
    }
}
