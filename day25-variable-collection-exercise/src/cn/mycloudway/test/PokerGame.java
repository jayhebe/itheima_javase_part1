package cn.mycloudway.test;

import java.util.ArrayList;
import java.util.Comparator;

public class PokerGame {
    public PokerGame() {
        ArrayList<Poke.Card> cards = Poke.getCards();

        ArrayList<Poke.Card> lord = new ArrayList<>();
        ArrayList<Poke.Card> player1 = new ArrayList<>();
        ArrayList<Poke.Card> player2 = new ArrayList<>();
        ArrayList<Poke.Card> player3 = new ArrayList<>();

        for (int i = 0; i < cards.size(); i++) {
            if (i < 3) {
                lord.add(cards.get(i));
                continue;
            }

            if (i % 3 == 0) {
                player1.add(cards.get(i));
            } else if (i % 3 == 1) {
                player2.add(cards.get(i));
            } else {
                player3.add(cards.get(i));
            }
        }

        Comparator<Poke.Card> comparator = (Poke.Card c1, Poke.Card c2) -> Poke.getScore(c2) - Poke.getScore(c1);

        lord.sort(comparator);
        player1.sort(comparator);
        player2.sort(comparator);
        player3.sort(comparator);

        System.out.println(lord);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
    }
}
