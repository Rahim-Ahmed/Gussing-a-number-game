package GuessGame;
import javax.swing.*;
public class Gussinggame {




    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*10 + 1);
        int userAnswer = 0;
        System.out.println("The correct guess would be " + computerNumber);
        int count = 1;

        while (userAnswer != computerNumber)
        {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 10", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count));
            count++;
        }
    }

    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if (userAnswer <=0 || userAnswer >10) {
            return "Your guess is invalid. Guess between 1 - 10";
        }
        else if (userAnswer == computerNumber ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNumber) {
            return "Your guess is too high, Guess something lower number try again.\nTrail Number: " + count;
        }
        else if (userAnswer < computerNumber) {
            return "Your guess is too low, Guess something grater number try again.\nTrail Number: " + count;
        }
        else {
            return " !! Your guess is incorrect !!\n Trial Number: " + count;
        }
    }
}