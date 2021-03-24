package ai.ccinnov.cardgame;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CardShuffle {
    public static void main(String[] args) {
        Login login = new Login("user123","mypassworD#2");
        //System.out.println(login.getSha1());
        Token newToken = new Token(login);
        newToken.generateToken();
        //This shuffling algo is highly randomised, and provides near perfect shuffles
        //as epoch count increases.
        //This is known as the "Fisher-Yates" solution for near perfect card shuffling
        String[] cards = {
                "1","2","3","4","5","6","7","8","9","10",
                "11","12","13","14","15","16","17","18","19","20",
                "21","22","23","24","25","26","27","28","29","30"};
        String[] colours = {"0","1","2"}; //!TODO Sort out card setup (Probably use chars or ints for efficiency)
        int shuffleFactor = 50000; //!TODO Work out the maths for efficient random sort
        int length = cards.length; //For time-saving purposes as we don't want to call the same method twice
        for(int i = 0; i<shuffleFactor;i++){
            int ranPos = ThreadLocalRandom.current().nextInt(0,length);
            cards = swapAt(cards, 2,ranPos);
        }

        //For testing purposes
        for(int j = 0; j<length;j++){
            System.out.print(cards[j]+", ");
        }
    }

    public static String[] swapAt(String[] cards, int a, int b){
        String buffer;
        buffer = cards[a];
        cards[a] = cards[b];
        cards[b] = buffer;
        return cards;
    }
}
