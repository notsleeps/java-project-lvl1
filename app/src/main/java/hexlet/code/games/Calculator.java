package hexlet.code.games;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.run;

public class Calculator {
    private static final String TASK = "What is the result of the expression?";
    public static final Character[] OPERATION = {'+', '-', '*'};
    public static void play() {
        String[][] gameData = new String[3][2];
        for (int i = 0; i < MAXROUND; i++) {
            int result = 0;
            int numberA = 1 + Utils.randomNumber10();
            int numberB = 1 + Utils.randomNumber10();
            int symbol = (int) (Math.random() * OPERATION.length);
            switch (OPERATION[symbol]) {
                case '+' -> {
                    result = numberA + numberB;
                    gameData[i][0] = numberA + " + " + numberB;
                    gameData[i][1] = String.valueOf(result);
                }
                case '-' -> {
                    result = numberA - numberB;
                    gameData[i][0] = numberA + " - " + numberB;
                    gameData[i][1] = String.valueOf(result);
                }
                case '*' -> {
                    result = numberA * numberB;
                    gameData[i][0] = numberA + " * " + numberB;
                    gameData[i][1] = String.valueOf(result);
                }
                default -> {
                    System.exit(0);
                }
            }
        }
        run(gameData, TASK);
    }
}
