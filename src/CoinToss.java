import java.util.Random;

public class CoinToss {

    // % 2 means 2 options, divisible by 2  tail or face, return the value
    public String tossACoin() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) %2 ;
        if (toss == 0){
            return "heads";
        }
        else {
            return "tails";
        }
    }
    public static void main(String[] args) {

        // TODOapplication here

        CoinToss game = new CoinToss();

        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());

    }

}
