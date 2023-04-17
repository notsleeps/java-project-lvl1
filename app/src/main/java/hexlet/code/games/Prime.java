package hexlet.code.games;
import static hexlet.code.Engine.run;
import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.YES;
import static hexlet.code.Engine.NO;
import hexlet.code.Engine;

public class Prime {
    private static int question1 = 1 + Engine.randomNumber100();
    private static final int QUESTION2 = 1 + Engine.randomNumber100();
    private static final int QUESTION3 = 1 + Engine.randomNumber100();
    static final String EXERCISE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String[][] questionanswer = {{null, null}, {null, null}, {null, null}};

    public static void primeNumberPlay() {
        for (int i = 0; i < MAXROUND; i++) {
            int num = question1;
            questionanswer[i][0] = String.valueOf(num);
            boolean b = true;
            final int maxDivisor = 20;
            for (int j = 2; j < maxDivisor; j++) {
                if (j == num) {
                    j++;
                }
                if (num % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                questionanswer[i][1] = YES;
            } else {
                questionanswer[i][1] = NO;
            }
            if (i == 0) {
                question1 = QUESTION2;
            } else {
                question1 = QUESTION3;
            }
        }
        run(questionanswer, EXERCISE);
    }
}
