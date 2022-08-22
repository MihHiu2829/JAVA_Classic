package MVC_example_mouse_2.Model;

public class mouse_model {
    private int x, y  ;
    private String checkIn ;
    private int count ;

    public mouse_model() {

        this.x = 0  ;
        this.y = 0  ;
        this.checkIn = "" ;
       this.count = 0  ;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }
    public void addClick(){
        this.count++ ;
    }
    public void enter(){
        this.checkIn = "Yes" ;
    }
    public void exit(){
        this.checkIn ="No" ;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
