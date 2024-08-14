package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Card> cards = new ArrayList<>();
    private String name;
    private int sum;
    public Player(String name) {
        this.name = name;
    }

    public void drawCard(Deck deck) {
        cards.add(deck.cards.get(0));
        deck.cards.remove(0);
        cards.sort(null);
    }

    public int rankSum() {
        sum = 0;
        for (Card card : cards) {
            sum += card.getRank();
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    public void printInfo() {
        System.out.println(this.getName() + "의 카드: " + this.cards + ", 합계: " + this.rankSum());
    }
}
