package OOP_15;

public class oto extends vhicle{
    private String fuel ;

    public oto(edittion edittion, String fuel) {
        super("Oto",edittion );
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public double getspeed() {
        return 75;
    }
}
