import java.util.Scanner;
public class UserGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min= 1;
        int max= 101;
        int guess = 50;
        System.out.println("Hello, my name is AI. AI wonder what's your number?");
        System.out.println("Please type higher, lower, or correct after my guess");
        System.out.println("Hmmm... Your number is " +guess);
        String pewpew = "";
        while (!(pewpew.equals("correct"))) {
            pewpew = input.nextLine();
            if (pewpew.equals("higher")) {
                min = guess;
                guess = (min+max)/2;
                System.out.println("Your number is " +guess);
            }
            if (pewpew.equals("lower")) {
                max = guess;
                guess = (min+max)/2;
                System.out.println("Your number is " +guess);
            }
            }
        System.out.println("You've guessed it! My number is " + guess);
        }
    }

