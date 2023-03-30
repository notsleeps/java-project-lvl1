package hexlet.code.games;
import hexlet.code.Engine;

import static hexlet.code.Engine.*;

public class GameEven {
    public static void even() {
        String yes = "yes";
        String no = "no";
        Engine.greeting();
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

    public static void main(String[] args) {
        GameEven.even();
    }

}
