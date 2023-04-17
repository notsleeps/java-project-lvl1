package hexlet.code;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import static hexlet.code.Engine.scanner;

public class Menu {
    static final int EXIT = 0;
    static final int GREETING = 1;
    static final int PARITY = 2;
    static final int CALC = 3;
    static final int GCD1 = 4;
    static final int PROGRESSION = 5;
    static final int PRIMENUMBER = 6;

    public static void showMenu() {

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        int num = Integer.parseInt(scanner.next());
        switch (num) {
            case EXIT -> System.exit(0);
            case GREETING -> Cli.greeting();
            case PARITY -> Even.evenPlay();
            case CALC -> Calculator.calcPlay();
            case GCD1 -> GCD.gcdPlay();
            case PROGRESSION -> Progression.progressionPlay();
            case PRIMENUMBER -> Prime.primeNumberPlay();
            default -> {
            }
        }
    }
}
