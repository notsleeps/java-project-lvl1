package hexlet.code.games;
import hexlet.code.Utils;

import static hexlet.code.Engine.run;
import static hexlet.code.Engine.MAXROUND;

public class Calculator {
    private static final String TASK = "What is the result of the expression?";
    public static final int ARRAYDEPTH = 2;
    public static final int ARRAYWIDTH = 3;
    public static final Character[] OPERATION = {'+', '-', '*'};
    public static void play() {

        String[][] gameData = new String[ARRAYWIDTH][ARRAYDEPTH];
        for (int i = 0; i < MAXROUND; i++) {
            int numberA = Utils.randomNumber10();
            int numberB = Utils.randomNumber10();
            int symbol = (int) (Math.random() * OPERATION.length);
            switch (OPERATION[symbol]) {
                case '+' -> {
                    gameData[i][0] = numberA + " + " + numberB;
                    gameData[i][1] = String.valueOf(numberA + numberB);
                }
                case '-' -> {
                    gameData[i][0] = numberA + " - " + numberB;
                    gameData[i][1] = String.valueOf(numberA - numberB);
                }
                case '*' -> {
                    gameData[i][0] = numberA + " * " + numberB;
                    gameData[i][1] = String.valueOf(numberA * numberB);
                }
                default -> {
                    System.out.println("Selected action is invalid");
                    System.exit(0);
                }
            }
        }
        run(gameData, TASK);
    }
}
