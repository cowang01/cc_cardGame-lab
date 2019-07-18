import java.util.ArrayList;

public class Dealer {

    private Deck deck;
    private ArrayList<Player> players;
    private Deck discard;

    public Dealer() {
        this.deck = new Deck();
        this.players = new ArrayList<Player>();
        this.discard = new Deck();
    }

    public Deck getDeck() {
        return deck;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int numberOfPlayers() {
        return this.players.size();
    }

    public void dealCards(Deck deck) {
        for (Player player: this.players){
            deck.dealOneCard(player);
        }
    }

    public Player getWinner() {
        Player winner = this.players.get(0);
        for (Player player: this.players){
            if (player.getScore() > winner.getScore()){
                winner = player;
            }
        }
        return winner;
    }

    public void addToDiscard(Player player){
        player.discardCard();
    }
}
