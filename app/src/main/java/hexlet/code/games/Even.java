package hexlet.code.games;
import hexlet.code.Utils;
import static hexlet.code.Engine.run;
import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.YES;
import static hexlet.code.Engine.NO;
public class Even {
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static boolean evenLogic(int number) {
        return  (number % 2 == 0);
    }
    public static void play() {
        String[][] gameData = new String[3][2];
        for (int i = 0; i < MAXROUND; i++) {
            int question = 1 + Utils.randomNumber100();
            gameData[i][0] = String.valueOf(question);
            if (evenLogic(question)) {
                gameData[i][1] = YES;
            } else {
                gameData[i][1] = NO;
            }
        }
        run(gameData, TASK);
    }
}
