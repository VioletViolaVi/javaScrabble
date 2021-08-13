import java.util.Scanner;

public class ScrabbleMain {
    public static void main(String[] args) {
        ScrabbleScore scoreInstance = new ScrabbleScore();
        System.out.println("Enter your word or '*' to quit");
        Scanner scanInstance = new Scanner(System.in);
        String userInput = scanInstance.next();
        while (!userInput.equals("*")) {
            System.out.println("Your score for \"" + userInput + "\" is " + scoreInstance.getScrabbleScore(userInput));
            System.out.println("Enter your word or '*' to quit");
            userInput = scanInstance.next();
        }

    }
}
