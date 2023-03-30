package hexlet.code;
import static hexlet.code.Engine.getScanner;
public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        int number = Integer.parseInt(getScanner().next());
        Engine.menu(number);
    }
}
