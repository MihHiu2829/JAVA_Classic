package OOP_15;

public abstract class vhicle {
        protected String name_vhicle ;
         protected edittion edittion  ;

    public vhicle(String name_vhicle, OOP_15.edittion edittion) {
        this.name_vhicle = name_vhicle;
        this.edittion = edittion;
    }

    public String getName_vhicle() {
        return name_vhicle;
    }

    public void setName_vhicle(String name_vhicle) {
        this.name_vhicle = name_vhicle;
    }

    public OOP_15.edittion getEdittion() {
        return edittion;
    }

    public void setEdittion(OOP_15.edittion edittion) {
        this.edittion = edittion;
    }
    public String getNameedititon(){
        return this.getEdittion().getName_edition() ;
    }
    public void begin(){
        System.out.println("begin to run....");
    }
    public void speeds(){
        System.out.println("speeds derceased/...");
    }
    public void stop(){
        System.out.println("Stop please.... ");
    }
    public abstract double getspeed() ;
}
