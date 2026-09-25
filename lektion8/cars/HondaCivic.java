package cars;
public class HondaCivic implements StreetLeagal {

    @Override
    public void turn(double angle) {
        System.out.println("Svängelisväng");
    }

    @Override
    public void accelerate(int amount) {
        System.out.println("Haha, det kan du drömma om...");
    }

    @Override
    public void decelerate(int amount) {
        System.out.println("Bromsar!!!!");
    }

    @Override
    public void shiftGear(int gear) {
        System.out.println("byter växel (och snart hela lådan)");
    }

    @Override
    public void turnOnLights() {
        System.out.println("nu blir det ljust!");
    }

    @Override
    public void blinkLeft() {
        System.out.println("vänster");
    }

    @Override
    public void blinkRight() {
        System.out.println("höger");
    }
    
}
