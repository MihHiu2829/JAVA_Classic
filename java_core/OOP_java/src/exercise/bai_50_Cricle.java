package exercise;

public class bai_50_Cricle {
    private double r ;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
     public double getArea(){
        return r*r*Math.PI ;
     }
    public bai_50_Cricle(double r) {
        this.r = r;
    }

    public bai_50_Cricle() {
    }

    @Override
    public String toString() {
        return "bai_50_Cricle{" +
                "r=" + r + " area =" + getArea()+
                '}';
    }
}
