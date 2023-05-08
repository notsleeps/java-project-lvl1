package hexlet.code.games;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.run;

public class Progression {
    private static final String TASK = "What number is missing in the progression?";
    public static final int ARRAYDEPTH = 2;
    public static final int ARRAYWIDTH = 3;
    public static final int PROGRESSIONLENGHT = 11;


    public static void play() {
        String[][] gameData = new String[ARRAYWIDTH][ARRAYDEPTH];
        for (int i = 0; i < MAXROUND; i++) {
            int initialvalue = 1 + Utils.randomNumber10();
            final int step = 1 + Utils.randomNumber10();
            final int hiddenNumber = Utils.randomNumber10();
            StringBuilder progression = new StringBuilder();
            for (int j = 1; j < PROGRESSIONLENGHT; j++) {
                initialvalue = initialvalue + step;
                if (j != hiddenNumber) {
                    progression.append(initialvalue).append(" ");
                } else {
                    progression.append(".. ");
                    gameData[i][1] = String.valueOf(initialvalue);
                }
            }
            gameData[i][0] = progression.toString();
        }
        run(gameData, TASK);
    }
}
