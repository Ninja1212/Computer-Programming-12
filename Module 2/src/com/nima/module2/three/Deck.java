package com.nima.module2.three;
import java.util.*;


public class Deck {

    private final LinkedList<Card> cards;

    public Deck() {
        LinkedList<Card> unShuffledCards = createDeck();
        cards = shuffle(unShuffledCards);
    }

    private LinkedList<Card> createDeck() {
        LinkedList<Card> unShuffledCards = new LinkedList<>();
        for (Suit suit : Suit.values()) {
            for (int value = 1; value <= 10; value++) {
                unShuffledCards.add(new Card(suit, String.valueOf(value)));
            }
            unShuffledCards.add(new Card(suit, "K"));
            unShuffledCards.add(new Card(suit, "Q"));
            unShuffledCards.add(new Card(suit, "J"));
        }
        return unShuffledCards;
    }

    private LinkedList<Card> shuffle(LinkedList<Card> unShuffledCards) {
        Random random = new Random();
        LinkedList<Card> shuffledCards = new LinkedList<>();

        while (!unShuffledCards.isEmpty()) {
            int randomIndex = random.nextInt(unShuffledCards.size());
            shuffledCards.push(unShuffledCards.remove(randomIndex));
        }
        return shuffledCards;
    }

    public List<Card> pollSeven() {
        List<Card> polledCards = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            polledCards.add(cards.poll());
        }
        return polledCards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck = (Deck) o;
        return Objects.equals(cards, deck.cards);
    }

    @Override
    public int hashCode() {
        return cards.hashCode();
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
