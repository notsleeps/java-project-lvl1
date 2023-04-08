package hexlet.code.games;
import hexlet.code.Engine;
public class Progression {
    private static final int A1 = Engine.randomNumber10();
    private static final int B1 = Engine.randomNumber10();
    private static final int A2 = Engine.randomNumber10();
    private static final int B2 = Engine.randomNumber10();
    private static final int A3 = Engine.randomNumber10();
    private static final int B3 = Engine.randomNumber10();
    public static void progress() {
        Engine.progressionLogic(A1, B1, A2, B2, A3, B3);
    }
}
