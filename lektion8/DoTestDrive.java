import cars.*;

public class DoTestDrive {
    public static void main(String[] args) {
        FordSMax car = new FordSMax();
        Driveable superCar = new BugattiChiron();
        Driveable civic = new HondaCivic();

        TheStig.testDrive(car);
        TheStig.testDrive(superCar);
        TheStig.testDrive(civic);

        car.getFuelAmount();
    }
}
