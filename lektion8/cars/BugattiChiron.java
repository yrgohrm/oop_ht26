package cars;

public class BugattiChiron implements Driveable {

    @Override
    public void turn(double angle) {
        System.out.println("Swoosh, svänger " + angle);
    }

    @Override
    public void accelerate(int amount) {
        System.out.println("Vrooooooooom!");
    }

    @Override
    public void decelerate(int amount) {
        System.out.println("Screeeech. Bromsar!!");
    }

    @Override
    public void shiftGear(int gear) {
        System.out.println("clickclack, nu är vi på växel " + gear);
    }
}
