import java.util.ArrayList;

public class Player {

    private int number;
    private ArrayList<Card> hand;


    public Player(int number) {
        this.number = number;
        this.hand = new ArrayList<Card>();
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void giveCard(Card card) {
        this.hand.add(card);
    }

    public int countNumberOfCards() {
        return this.hand.size();
    }

    public double getScore() {
        double score = 0;
        for (Card card: this.hand){
            score += card.getRank().getScore();
            score += card.getSuit().getScore();
        }
        return score;
    }
}
