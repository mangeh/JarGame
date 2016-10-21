import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Prompter p = new Prompter();
        Jar jar = p.createJar();
        p.makeGuess(jar);

    }
}
