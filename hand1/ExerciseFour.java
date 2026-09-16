public class ExerciseFour {
    public static void main(String[] args) {
        Bottle theBottle = new Bottle(200, 400);
        theBottle.fill(100);
        theBottle.drink(20);
        System.out.println("The bottle now contains " + theBottle.volume() + " ml.");

        int actualAmount = theBottle.drink(1000);
        System.out.println("Actual amount: " + actualAmount);
    }
}