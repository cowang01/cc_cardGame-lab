import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void setup(){
        player = new Player(1);
        card = new Card(CardRank.FOUR, CardSuit.SPADES);
    }


    @Test
    public void playerHasAScore(){
        player.giveCard(card);
        assertEquals(4.4, player.getScore(), 0.01);
    }
}
