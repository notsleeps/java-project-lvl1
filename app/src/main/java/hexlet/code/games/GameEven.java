package hexlet.code.games;
import static hexlet.code.Engine.greeting;
import static hexlet.code.Engine.randomNumber100;
import static hexlet.code.Engine.wrongResultStringNo;
import static hexlet.code.Engine.wrongResultStringYes;
import static hexlet.code.Engine.setUserAnswer;
import static hexlet.code.Engine.getUserAnswer;
import static hexlet.code.Engine.rightResult;
import static hexlet.code.Engine.getScanner;
import static hexlet.code.Engine.getMaxround;


public class GameEven {
    public static void even() {
        String yes = "yes";
        String no = "no";
        greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < getMaxround(); i++) {
            int num = randomNumber100();
            System.out.println("Question: " + num);
            setUserAnswer(getScanner().next());
            if ((num % 2 == 0 & getUserAnswer().equals(yes)) || (num % 2 != 0 & getUserAnswer().equals(no))) {
                rightResult();
            } else if (num % 2 == 0 & !getUserAnswer().equals(yes)) {
                wrongResultStringYes();
                break;
            } else {
                wrongResultStringNo();
                break;
            }
        }
    }
}
