package com.nima.module2.three;
import java.util.Comparator;

 // Since Ace isn't a face card it will be a 1 (the lowest value)

public class NumberComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        String value1 = o1.getValue();
        String value2 = o2.getValue();

        if (value1.equals(value2)) return 0;
        if (o1.isFaceCard()) {
            if (!o2.isFaceCard()) return -1;
            switch (value1) {
                case "K" -> {
                    return -1;
                }
                case "Q" -> {
                    if (value2.equals("K")) return 1;
                    return -1;
                }
                case "J" -> {
                    if (value2.equals("K") || value2.equals("Q")) return 1;
                    return -1;
                }
            }
        } else if (o2.isFaceCard()) {
            // Face cards will be bigger than a non-face card
            return 1;
        }
        // Neither are face cards, so we just compare the values
        return Integer.parseInt(value1) > Integer.parseInt(value2) ? -1 : 1;
    }
}