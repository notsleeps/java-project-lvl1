package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final int A = 1 + Engine.randomNumber10();
    private static final int B = 1 + Engine.randomNumber100();
    private static final int C = 1 + Engine.randomNumber100();
    public static void primeNumber() {
        Engine.primeNumberLogic(A, B, C);
    }
}
