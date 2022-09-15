import java.util.Random;
import java.util.Scanner;

public class Diceguess {
    public static void main(String[] args) {

        int computerGuess;
        String ligeEllerUlige;

        // if(guess %2 ==0 ) //Dette betyder lige

        //  if (guess %2 != 0) //Dette betyder ulige.


        Scanner scan = new Scanner(System.in);
        Random dice = new Random();
        computerGuess = dice.nextInt(6) + 1;
        System.out.println(computerGuess);


        System.out.println("gæt om det er lige eller ulige");
        ligeEllerUlige = scan.nextLine();


        if (computerGuess % 2 == 0 && ligeEllerUlige.equals("lige")) {
            System.out.println("Du gættede lige og det var rigtigt");
        } else if(computerGuess % 2 != 0 && ligeEllerUlige.equals("ulige")){
            System.out.println("Du gættede ulige og det var rigtigt");
        } else {
            System.out.println("Dit gæt var forkert");
        }

    }
}
