package OOP_9kethua;

public class student extends human{
        private String zClass ;
        private String SchoolName ;

    public student(String name, int date, String aClass, String schoolName) {
        super(name, date);
        zClass = aClass;
        SchoolName = schoolName;
    }

    public String getzClass() {
        return zClass;
    }

    public void setzClass(String zClass) {
        this.zClass = zClass;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }
    public void sea(){

    }
}
