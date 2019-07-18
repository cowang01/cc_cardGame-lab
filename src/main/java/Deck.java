import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }


    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public int countNumberOfCards() {
        return this.cards.size();
    }


    public void populate() {
        for ( CardSuit suit: CardSuit.values() ){
            for ( CardRank rank: CardRank.values() ){
                this.cards.add(new Card(rank, suit));
            }
        }
    }

    public Card getFirstCard() {
        return cards.get(0);
    }

    public CardRank getFirstCardRank() {
        return cards.get(0).rank;
    }

    public CardSuit getFirstCardSuit() {
        return cards.get(0).suit;
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }
}
