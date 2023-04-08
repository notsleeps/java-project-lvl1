package hexlet.code.games;
import hexlet.code.Engine;
public class GameEven {
    private static final int A = 1 + Engine.randomNumber100();
    private static final int B = 1 + Engine.randomNumber100();
    private static final int C = 1 + Engine.randomNumber100();
    public static void even() {
        Engine.evenLogic(A, B, C);
    }
}
