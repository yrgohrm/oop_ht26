import java.util.random.RandomGenerator;

public class GameDie {
    private int sides;
    private int numberOfRolls;
    private int sumOfAllRolls;

    public GameDie(int sides) {
        this.sides = sides;
        this.numberOfRolls = 0;
        this.sumOfAllRolls = 0;
    }

    public GameDie() {
        this(6);
    }

    public int roll() {
        RandomGenerator rand = RandomGenerator.getDefault();

        int roll = rand.nextInt(1, sides + 1);
        sumOfAllRolls += roll;
        numberOfRolls++;

        return roll;
    }

    public double mean() {
        return sumOfAllRolls / (double)numberOfRolls;
    }
}
