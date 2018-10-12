import java.util.Scanner;
public class UserGuess {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int aiGuess = (int)(Math.random()*101)
        System.out.println("Hello, my name is AI. AI wonder what's your number?");
        System.out.println("Hmmmm...");
        while (true) {
            if (aiGuess < 5) {
                break;
            }
        }

}