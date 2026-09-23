public class Exercise4 {
    void main() {
        GameDie d20 = new GameDie(20);
        GameDie d6 = new GameDie();

        for (int i = 0; i < 10000; ++i) {
            d20.roll();
        }

        for (int i = 0; i < 10000; ++i) {
            d6.roll();
        }

        System.out.println(d20.mean());
        System.out.println(d6.mean());
    }
}
