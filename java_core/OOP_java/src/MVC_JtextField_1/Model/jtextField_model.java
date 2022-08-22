package MVC_JtextField_1.Model;

public class jtextField_model {
    private double firstValue ;
    private double secondValue ;
    private double result ;

    public jtextField_model() {
    }

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    public void plus(){
        this.result = this.firstValue + this.secondValue ;
    }
    public void minus(){
        this.result = this.firstValue + this.secondValue ;
    }
    public void multiply(){
        this.result = this.firstValue*this.secondValue ;
    }
    public void divide(){
        this.result = this.firstValue/this.secondValue ;
    }
    public void power(){
        this.result = Math.pow(this.firstValue,this.firstValue) ;
    }
    public void mod(){
        this.result = this.firstValue%this.secondValue ;
    }
}

