package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.run;
import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.YES;
import static hexlet.code.Engine.NO;
public class Even {
    public static String[][] queANDans = {{null, null}, {null, null}, {null, null}};
    static final String EXERCISE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static  int question1 = 1 + Engine.randomNumber100();
    private static final int QUESTION2 = 1 + Engine.randomNumber100();
    private static final int QUESTION3 = 1 + Engine.randomNumber100();
    public static void evenPlay() {
        for (int i = 0; i < MAXROUND; i++) {
            int num = question1;
            queANDans[i][0] = String.valueOf(num);
            if (num % 2 == 0) {
                queANDans[i][1] = YES;
            } else {
                queANDans[i][1] = NO;
            }
            if (i == 0) {
                question1 = QUESTION2;
            } else {
                question1 = QUESTION3;
            }
        }
        run(queANDans, EXERCISE);
    }
}
