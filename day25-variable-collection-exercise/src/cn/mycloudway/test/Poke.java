package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

public class Poke {
    private static final ArrayList<Card> cards = new ArrayList<>();
    private static final HashMap<Card, Integer> scores = new HashMap<>();

    static {
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] values = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        int score = 100;
        for (String value : values) {
            for (String color : colors) {
                Card card = new Card(color, value);
                cards.add(card);
                scores.put(card, score);
                score--;
            }
        }

        cards.add(new Card("", "小王"));
        cards.add(new Card("", "大王"));

        scores.put(new Card("", "小王"), 500);
        scores.put(new Card("", "大王"), 1000);
    }

    private Poke() {
    }

    public static ArrayList<Card> getCards() {
        Collections.shuffle(cards);
        return cards;
    }

    public static int getScore(Card card) {
        return scores.get(card);
    }

    public static class Card {
        private String color;
        private String value;

        public Card() {
        }

        public Card(String color, String value) {
            this.color = color;
            this.value = value;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String toString() {
            return color + value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Card card = (Card) o;
            return Objects.equals(color, card.color) && Objects.equals(value, card.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color, value);
        }
    }
}
