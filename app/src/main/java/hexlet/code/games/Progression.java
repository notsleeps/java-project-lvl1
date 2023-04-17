package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.run;

public class Progression {

    private static int initialvalue1 = 1 + Engine.randomNumber10();
    private static final int INITIALVALUE2 = 1 + Engine.randomNumber10();
    private static final int INITIALVALUE3 = 1 + Engine.randomNumber10();
    private static int step1 = 1 + Engine.randomNumber10();
    private static final int STEP2 = 1 + Engine.randomNumber10();
    private static final int STEP3 = 1 + Engine.randomNumber10();
    static final String EXERCISE = "What number is missing in the progression?";
    private static String[][] questionanswer = {{null, null}, {null, null}, {null, null}};

    public static void progressionPlay() {
        for (int i = 0; i < MAXROUND; i++) {
            int initialNum = initialvalue1;
            int stepProgression = step1;
            final int hiddenNumber = Engine.randomNumber10();
            final int progressionLength = 11;
            String result;
            StringBuilder quest = new StringBuilder();
            for (int j = 1; j < progressionLength; j++) {
                initialNum = initialNum + stepProgression;
                if (j != hiddenNumber) {
                    quest.append(initialNum).append(" ");
                } else {
                    quest.append(".. ");
                    questionanswer[i][1] = String.valueOf(initialNum);
                }
            }
            result = quest.toString();
            questionanswer[i][0] = result;
            if (i == 0) {
                initialvalue1 = INITIALVALUE2;
                step1 = STEP2;
            } else {
                initialvalue1 = INITIALVALUE3;
                step1 = STEP3;
            }
        }
        run(questionanswer, EXERCISE);
    }
}
