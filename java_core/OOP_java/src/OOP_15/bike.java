package OOP_15;

public class bike extends vhicle{
    public bike(edittion hangsansuat) {
        super("Bicycle",hangsansuat);
    }

    @Override
    public double getspeed() {
        return 25 ;
    }
}
