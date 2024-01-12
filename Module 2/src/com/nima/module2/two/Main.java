package com.nima.module2.two;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Card.Suit suit = null;
        LinkedList<Card> deck = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                suit = Card.Suit.CLUBS;
            } else if (i == 1) {
                suit = Card.Suit.SPADES;
            } else if (i == 2) {
                suit = Card.Suit.DIAMONDS;
            } else if (i == 3) {
                suit = Card.Suit.HEARTS;
            }

            for (int j = 1; j < 11; j++) {
                deck.add(new Card(j, suit));
            }
            deck.add(new Card(Card.Face.JACK, suit));
            deck.add(new Card(Card.Face.QUEEN, suit));
            deck.add(new Card(Card.Face.KING, suit));
        }
        Collections.shuffle(deck);
        for (int i = 0; i < 7; i++) {
            System.out.println(deck.poll().toString());
        }
    }
}
