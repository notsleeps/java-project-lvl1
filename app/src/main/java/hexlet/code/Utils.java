package hexlet.code;

public class Utils {
    private static final int RANDOM_NUMBER_FROM2 = 2;
    private static final int RANDOM_NUMBER_TO100 = 100;
    private static final int RANDOM_NUMBER_FROM1 = 1;
    private static final int RANDOM_NUMBER_TO10 = 10;
    public static int randomNumber100() {
        return RANDOM_NUMBER_FROM2 + (int) (Math.random() * RANDOM_NUMBER_TO100);
    }
    public static int randomNumber10() {
        return RANDOM_NUMBER_FROM1 + (int) (Math.random() * RANDOM_NUMBER_TO10);
    }

}
