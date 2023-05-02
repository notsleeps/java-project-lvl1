package hexlet.code.games;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.run;

public class Progression {
    private static final String TASK = "What number is missing in the progression?";

    public static void play() {
        final int arrayDepth = 2;
        final int arrayWidth = 3;
        String[][] gameData = new String[arrayWidth][arrayDepth];
        for (int i = 0; i < MAXROUND; i++) {
            int initialvalue = 1 + Utils.randomNumber10();
            final int step = 1 + Utils.randomNumber10();
            final int hiddenNumber = Utils.randomNumber10();
            final int progressionLength = 11;
            StringBuilder progression = new StringBuilder();
            for (int j = 1; j < progressionLength; j++) {
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

    public static void main(String[] args) {
        play();
    }
}
