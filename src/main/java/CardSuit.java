public enum CardSuit {

    CLUBS(0.1),
    DIAMONDS(0.2),
    HEARTS(0.3),
    SPADES(0.4);

    private final double score;

    CardSuit(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }
}
