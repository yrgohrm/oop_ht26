public class CardMain {
    void main() {
        Card card = new Card(Suit.DIAMONDS, 11);
        System.out.println(card);

        for (Suit s : Suit.values()) {
            System.out.println(s);
        }

        System.out.println(Suit.DIAMONDS.ordinal());
    }
}
