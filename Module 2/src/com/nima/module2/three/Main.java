package com.nima.module2.three;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        List<Card> hand = deck.pollSeven();

        System.out.println("Random deck of cards:");
        for (Card card : hand) {
            System.out.println(card);
        }

        hand.sort(new SuitComparator());
        System.out.println("Sorted by suit:");
        for (Card card : hand) {
            System.out.println(card);
        }

        hand.sort(new NumberComparator());
        System.out.println("Sorted by value:");
        for (Card card : hand) {
            System.out.println(card);
        }
    }
}