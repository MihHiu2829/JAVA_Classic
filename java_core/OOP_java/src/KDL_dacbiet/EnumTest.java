package KDL_dacbiet;

public class EnumTest {
    private Date thu ;
    private String cacMonHoc ;

    public EnumTest(Date thu, String cacMonHoc) {
        this.thu = thu;
        this.cacMonHoc = cacMonHoc;
    }

    public Date getThu() {
        return thu;
    }

    public void setThu(Date thu) {
        this.thu = thu;
    }

    public String getCacMonHoc() {
        return cacMonHoc;
    }

    public void setCacMonHoc(String cacMonHoc) {
        this.cacMonHoc = cacMonHoc;
    }

    @Override
    public String toString() {
        return "EnumTest{" +
                "thu=" + thu +
                ", cacMonHoc='" + cacMonHoc + '\'' +
                '}';
    }
}
