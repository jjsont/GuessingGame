import java.util.Scanner;
public class GuessingGame {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();
        int random = (int)(Math.random()*11);
        System.out.println("What is the random number from 1-10, " + name + "?");
        int num = input.nextInt();
        while (random != num) {
            System.out.println("You got it wrong, " + name + " guess again");
            num = input.nextInt();
        }
        System.out.println("Good job, " + name +" you finally got it");
    }
}
