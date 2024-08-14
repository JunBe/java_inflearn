package collection.compare.test;

public class Card implements Comparable<Card>{
    private Suit icon;
    private int rank;

    public Card(Suit icon, int rank) {
        this.icon = icon;
        this.rank = rank;
    }

    public Suit getIcon() {
        return icon;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card anotherCard) {
        if (this.rank != anotherCard.rank) {
            return Integer.compare(this.rank, anotherCard.rank);
        } else {
            return this.icon.compareTo(anotherCard.icon);
        }
    }

    @Override
    public String toString() {
        return rank + "(" + icon.getIcon() + ")";
    }
}
