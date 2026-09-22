public class Player {
    private int level;
    private String name;
    private int score;

    public Player(String name) {

        if (isValidName(name)) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.score = 0;
        this.level = 1;
    }

    public void levelUp() {
        level++;
        increaseScore(100);
    }

    public void increaseScore(int score) {
        if (score > 0) {
            this.score += score;

            if (score > 1000) {
                levelUp();
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getLevel() {
        return level;
    }

    private boolean isValidName(String name) {
        return name == null || name.isBlank();
    }
}
