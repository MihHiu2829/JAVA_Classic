package OOP_16;

public class CasioFx500 implements caculator{
    @Override
    public double cong(double a, double b) {
        return a+b ;
    }

    @Override
    public double tru(double a, double b) {
        return a-b ;
    }

    @Override
    public double nhan(double a, double b) {
        return a*b ;
    }

    @Override
    public double chia(double a, double b) {
        if(a==0) return 0 ;
        return a/b  ;
    }
}
