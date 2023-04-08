package hexlet.code;
import hexlet.code.games.Calculator;
import hexlet.code.games.GameEven;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class Engine {
    private static Scanner scanner = new Scanner(System.in);
    public static Scanner getScanner() {
        return scanner;
    }

    private static String userName;
    public static final String YES = "yes";
    public static final String NO = "no";
    public static void setUserName(String str) {
        userName = str;
    }
    public static String getUserName() {
        return userName;
    }
    private static int userResult;
    public static void setUserResult(int i) {
        userResult = i;
    }
    public static int getUserResult() {
        return userResult;
    }
    private static String userAnswer;
    public static void setUserAnswer(String str) {
        userAnswer = str;
    }
    public static String getUserAnswer() {
        return userAnswer;
    }
    private static int result;
    public static int getResult() {
        return result;
    }
    public static void setResult(int i) {
        result = i;
    }
    private static int round = 0;
    public static int getMaxround() {
        final int maxround = 3;
        return maxround;
    }
    public static void showMenu() {
        final int greeting = 1;
        final int parity = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int primenumber = 6;

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        int num = Integer.parseInt(getScanner().next());

        switch (num) {
            case greeting -> Cli.greeting();
            case parity -> GameEven.even();
            case calc -> Calculator.calc();
            case gcd -> GCD.gcd();
            case progression -> Progression.progress();
            case primenumber -> Prime.primeNumber();
            default -> {
            }
        }
    }

    public static void evenLogic(int one, int two, int three) {
        greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < getMaxround(); i++) {
            int num = one;
            System.out.println("Question: " + num);
            setUserAnswer(getScanner().next());
            if ((num % 2 == 0 & getUserAnswer().equals(YES)) || (num % 2 != 0 & getUserAnswer().equals(NO))) {
                rightResult();
                if (i == 0) {
                    one = two;
                } else {
                    one = three;
                }
            } else if (num % 2 == 0 & !getUserAnswer().equals(YES)) {
                wrongResultStringYes();
                break;
            } else {
                wrongResultStringNo();
                break;
            }
        }
    }

    public static void primeNumberLogic(int a1, int b1, int c1) {
        greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < getMaxround(); i++) {
            int num = a1;
            boolean b = true;
            final int maxDivisor = 20;
            System.out.println("Question: " + num);
            setUserAnswer(getScanner().next());
            for (int j = 2; j < maxDivisor; j++) {
                if (j == num) {
                    j++;
                }
                if (num % j == 0) {
                    b = false;
                    break;
                }
            }
            if (!b && getUserAnswer().equals(NO) || b && getUserAnswer().equals(YES)) {
                rightResult();
                if (i == 0) {
                    a1 = b1;
                } else {
                    a1 = c1;
                }
            } else if (!b && getUserAnswer().equals(YES)) {
                wrongResultStringNo();
                break;
            } else {
                wrongResultStringYes();
                break;
            }
        }
    }

    public static void gcdLogic(int a1, int b1, int a2, int b2, int a3, int b3) {
        greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < getMaxround(); i++) {
            int num1 = a1;
            int num2 = b1;
            System.out.println("Question: " + num1 + " " + num2);
            for (int j = num1; j > 0; j--) {
                if (num1 % j == 0 & num2 % j == 0) {
                    setResult(j);
                    break;
                }
            }
            System.out.print("You answer: ");
            setUserResult(Integer.parseInt(getScanner().next()));
            if (getUserResult() == getResult()) {
                rightResult();
                if (i == 0) {
                    a1 = a2;
                    b1 = b2;
                } else {
                    a1 = a3;
                    b1 = b3;
                }
            } else {
                wrongResultInt();
                break;
            }
        }
    }

    public static void progressionLogic(int a1, int b1, int a2, int b2, int a3, int b3) {
        greeting();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < getMaxround(); i++) {
            int initialNum = a1;
            int stepProgression = b1;
            final int hiddenNumber = Engine.randomNumber10();
            final int progressionLength = 11;
            System.out.print("Question: ");
            for (int j = 1; j < progressionLength; j++) {
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
                if (i == 0) {
                    a1 = a2;
                    b1 = b2;
                } else {
                    a1 = a3;
                    b1 = b3;
                }
            } else {
                wrongResultInt();
                break;
            }
        }
    }

    public static void calculatorLogic(int a1, int b1, int a2, int b2, int a3, int b3) {
        greeting();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < getMaxround(); i++) {
            int num1 = a1;
            int num2 = b1;
            final int numberOfOperation = 3;
            int symbol = (int) (Math.random() * numberOfOperation);
            if (symbol == 0) {
                setResult(num1 * num2);
                System.out.println("Question: " + num1 + " * " + num2);
                setUserResult(Integer.parseInt(getScanner().next()));
                if (getResult() == getUserResult()) {
                    rightResult();
                    if (i == 0) {
                        a1 = a2;
                        b1 = b2;
                    } else {
                        a1 = a3;
                        b1 = b3;
                    }

                } else {
                    wrongResultInt();
                    break;
                }
            } else if (symbol == 1) {
                setResult(num1 - num2);
                System.out.println("Question: " + num1 + " - " + num2);
                setUserResult(Integer.parseInt(getScanner().next()));
                if (getResult() == getUserResult()) {
                    rightResult();
                    if (i == 0) {
                        a1 = a2;
                        b1 = b2;
                    } else {
                        a1 = a3;
                        b1 = b3;
                    }
                } else {
                    wrongResultInt();
                    break;
                }
            } else {
                setResult(num1 + num2);
                System.out.println("Question: " + num1 + " + " + num2);
                setUserResult(Integer.parseInt(getScanner().next()));
                if (getResult() == getUserResult()) {
                    rightResult();
                    if (i == 0) {
                        a1 = a2;
                        b1 = b2;
                    } else {
                        a1 = a3;
                        b1 = b3;
                    }
                } else {
                    wrongResultInt();
                    break;
                }
            }
        }
    }

    public static void rightResult() {
        System.out.println("Correct!");
        round++;
        if (round == getMaxround()) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    public static void wrongResultInt() {
        System.out.println("'" + userResult + "'" + " is wrong answer ;(. Correct answer was "
                + "'" + result + "'" + " Let's try again, " + userName + "!");
    }

    public static void wrongResultStringYes() {
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'yes'.\n"
                + "Let's try again, " + userName + "!");
    }

    public static void wrongResultStringNo() {
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'no'.\n"
                + "Let's try again, " + userName + "!");
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Engine.userName = Engine.scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static int randomNumber100() {
        final int randomNumberFrom2 = 2;
        final int randomNumberTo100 = 100;
        return randomNumberFrom2 + (int) (Math.random() * randomNumberTo100);
    }
    public static int randomNumber10() {
        final int randomNumberFrom1 = 1;
        final int randomNumberTo10 = 10;
        return randomNumberFrom1 + (int) (Math.random() * randomNumberTo10);
    }

}

