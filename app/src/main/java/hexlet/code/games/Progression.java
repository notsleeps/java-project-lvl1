package hexlet.code.games;
import static hexlet.code.Engine.scanner;
import static hexlet.code.Engine.randomNumber10;
import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.result;
import static hexlet.code.Engine.userResult;
import static hexlet.code.Engine.rightResult;
import static hexlet.code.Engine.wrongResult;
public class Progression {

    public static void progress() {
        greeting();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < 3; i++) {
            int initialNum = randomNumber10();
            int stepProgression = randomNumber10();
            int hiddenNumber = randomNumber10();
            System.out.print("Question: ");
            for (int j = 1; j < 11; j++) {
                initialNum = initialNum + stepProgression;
                if (j != hiddenNumber) {
                    System.out.print(initialNum + " ");
                } else {
                    result = initialNum;
                    System.out.print(".. ");
                }
            }
            System.out.print("\nYour answer: ");
            userResult = Integer.parseInt(scanner.next());
            if (userResult == result) {
                rightResult();
            } else {
                wrongResult();
                break;
            }
        }
    }
    public static void main(String[] args) {
        progress();
    }
}
