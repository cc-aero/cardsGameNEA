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
        int shuffleFactor = 50000;
        int length = cards.length;
        for(int i = 0; i<shuffleFactor;i++){
            int ranPos = ThreadLocalRandom.current().nextInt(0,length);
            cards = swapAt(cards, 2,ranPos);
        }
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
