package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final int A1 = 1 + Engine.randomNumber100();
    private static final int B1 = 1 + Engine.randomNumber100();
    private static final int A2 = 1 + Engine.randomNumber100();
    private static final int B2 = 1 + Engine.randomNumber100();
    private static final int A3 = 1 + Engine.randomNumber100();
    private static final int B3 = 1 + Engine.randomNumber100();

    public static void gcd() {
        Engine.gcdLogic(A1, B1, A2, B2, A3, B3);
    }
}
