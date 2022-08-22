package MVC_6.Model;

public class counter_model {
    private int value ;

    public counter_model() {
        this.value = 0  ;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void Increment(){
        this.value++ ;
    }
    public void Decrement(){
        this.value-- ;
    }
    public void Reset(){
        this.value = 0  ;
    }
}
