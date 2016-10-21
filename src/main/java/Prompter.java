import java.util.Scanner;

/**
 * Created by Magnus on 2016-09-28.
 */
public class Prompter {

    public Jar createJar() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("What type of item? %n");
        String itemType = scanner.next();
        System.out.printf("What is the maximum amount of %s %n", itemType);
        Integer max = Integer.parseInt(scanner.next());
        return new Jar(itemType,max);
    }


    public void makeGuess(Jar jar) {
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int amountOfGuesses = 1;
        System.out.printf("How many %s %n", jar.getItem());
        System.out.printf("between 1 and %d %n",jar.getMaximumAllowed());
        while (guess != jar.getAmountInJar()) {
            guess = Integer.parseInt(scanner.next());
            if (guess < jar.getAmountInJar() && guess > 0) {
                System.out.printf("Guess is too low %n");
                amountOfGuesses++;
            } else if (guess > jar.getAmountInJar() && guess <= jar.getMaximumAllowed()){
                System.out.printf("Guess is too high %n" );
                amountOfGuesses++;
            } else {
                System.out.println("Your guess is above the max value or below 0, try again");
            }
        }
        System.out.printf("Correct! you got it right in %d attempts %n",amountOfGuesses);
    }
}
