package hexlet.code;
import static hexlet.code.Engine.scanner;
public class App {

    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                0 - Exit""");
        int number = Integer.parseInt(scanner.next());
        Engine.menu(number);
    }
}
