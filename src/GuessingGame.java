import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int attempts = 1;
        System.out.println("What's your name?");
        String name = input.nextLine();
        int random = (int) (Math.random() * 11);
        System.out.println("What is the random number from 0-10, " + name + "?");
        int num = input.nextInt();
        while (random != num) {
            System.out.println("You got it wrong, " + name + " guess again");
            num = input.nextInt();
            if (random != num) {
                attempts = attempts + 1;
            }
        }
        System.out.println("Good job, " + name + " you finally got it");
        System.out.println("Total attempts:" + attempts);
    }
}
