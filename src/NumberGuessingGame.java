import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int numberToGuess=(int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        int numberOfTries = 0;
        boolean hasGuessed = false;

        System.out.println("Guess the number and have fun!");
        System.out.println("Guess the number between 1 and 100");

        while(guess != numberToGuess){
            System.out.println("enter your guess");
            guess = sc.nextInt();
            numberOfTries++;

            if(guess < numberToGuess){
                System.out.println("too low");
            }else if(guess > numberToGuess){
                System.out.println("too high");
            }else{
                hasGuessed = true;
                System.out.println("great you guessed the number in" + numberOfTries + "tries" + numberToGuess);
            }
        }
        sc.close();
    }
}
