package OOP_15;

public class planes extends vhicle{
    private String fossil_fuel ;

    public planes(edittion hangsanxuat, String fossil_fuel) {
        super("Planes",hangsanxuat);
        this.fossil_fuel = fossil_fuel;
    }

    public String getFossil_fuel() {
        return fossil_fuel;
    }

    public void setFossil_fuel(String fossil_fuel) {
        this.fossil_fuel = fossil_fuel;
    }

    @Override
    public double getspeed() {
        return 800;
    }
    public void lift(){
        System.out.println("lift");
    }
    public void landing(){
        System.out.println("landing");
    }
}
