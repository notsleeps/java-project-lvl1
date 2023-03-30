package hexlet.code.games;
import static hexlet.code.Engine.*;
public class Progression {

    public static void progress() {
        greeting();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < getMaxround(); i++) {
            int initialNum = randomNumber10();
            int stepProgression = randomNumber10();
            int hiddenNumber = randomNumber10();
            System.out.print("Question: ");
            for (int j = 1; j < 11; j++) {
                initialNum = initialNum + stepProgression;
                if (j != hiddenNumber) {
                    System.out.print(initialNum + " ");
                } else {
                    setResult(initialNum);
                    System.out.print(".. ");
                }
            }
            System.out.print("\nYour answer: ");
            setUserResult(Integer.parseInt(getScanner().next()));
            if (getUserResult() == getResult()) {
                rightResult();
            } else {
                wrongResultInt();
                break;
            }
        }
    }
    public static void main(String[] args) {
        progress();
    }
}
