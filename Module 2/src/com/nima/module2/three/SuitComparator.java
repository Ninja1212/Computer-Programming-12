package com.nima.module2.three;
import java.util.Comparator;

public class SuitComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        Suit suit1 = o1.getSuit();
        Suit suit2 = o2.getSuit();
        if (suit1 == suit2) return 0;

        switch (suit1) {
            case DIAMOND -> {
                return 1;
            }
            case CLUB -> {
                if (suit2 == Suit.DIAMOND) return -1;
                return 1;
            }
            case HEART -> {
                if (suit2 == Suit.DIAMOND || suit2 == Suit.CLUB) return -1;
                return 1;
            }
            case SPADE -> {
                return -1;
            }
            default -> {
                // Should never happen
                return 0;
            }
        }
    }
}