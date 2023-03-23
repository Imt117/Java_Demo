package Exp02;

class Card {
    private String face;
    private String suit;

    public Card(String cardFace, String cardSuit) {
        face = cardFace;
        suit = cardSuit;
    }

    protected String getFace() {
        return face;
    }

    protected String getSuit() {
        return suit;
    }

    public String toString() {
        return suit + face;
    }
}

public class T_12201425_2_3 {
    public static void main(String[] args) {
        String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"黑桃", "红桃", "梅花", "方块"};

        Card[] deck = new Card[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }

        // 洗牌
        for (int first = 0; first < deck.length; first++) {
            int second = (int) (Math.random() * 52);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }

        // 打印洗好的牌
        for (Card card : deck) {
            System.out.println(card.toString());
        }
    }
}

