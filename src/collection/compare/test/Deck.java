package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<>();

    public Deck() {
        initCards();
    }

    private void initCards() {
        for (int i = 1; i <= 13; i++) {
            for (Suit value : Suit.values()) {
                cards.add(new Card(value, i));
            }
        }
        Collections.shuffle(cards);
    }

    private void drawCard() {

    }



}
