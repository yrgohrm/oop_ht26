import java.util.random.RandomGenerator;

public class Bottle {
    int volumeInMl;

    Bottle() {
        this(0);
    }

    Bottle(int startVolume) {
        this.volumeInMl = startVolume;
    }

    Bottle(int randMin, int randMax) {
        int rand = RandomGenerator.getDefault().nextInt(randMin, randMax+1);
        this.volumeInMl = rand;
    }

    void fill(int amount) {
        volumeInMl = volumeInMl + amount;
    }

    int drink(int amount) {
        if (amount > volumeInMl) {
            int leftToDrink = volumeInMl;
            volumeInMl = 0;
            return leftToDrink;
        }
        
        volumeInMl = volumeInMl - amount;
        return amount;
    }

    int volume() {
        return volumeInMl;
    }
}
