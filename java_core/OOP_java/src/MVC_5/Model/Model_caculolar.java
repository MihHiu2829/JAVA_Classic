package MVC_5.Model;

public class Model_caculolar {
   private int first,last ;

    public Model_caculolar() {
        first = 0   ;
        last = 0  ;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public int cong(){
        return first + last ;
    }

    public int tru(){
        return first - last ;
    }
    public int nhan(){
        return first*last ;
    }
}
