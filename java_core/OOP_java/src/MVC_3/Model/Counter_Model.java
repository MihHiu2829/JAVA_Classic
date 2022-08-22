package MVC_3.Model;

public class Counter_Model {
    private int value ;

    public Counter_Model() {
        this.value = 0 ;
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
