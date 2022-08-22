package MVC_example_mouse_3.Model;

public class model_mouse {
    private int x, y ;
    private int count ;
    private String CheckIn ;

    public model_mouse() {

        this.x = 0 ;
        this.y = 0  ;
        this.CheckIn = "" ;
        this.count = 0 ;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(String checkIn) {
        CheckIn = checkIn;
    }
    public void addClick(){
        this.count++ ;
    }
    public void enter(){
        this.CheckIn = "Yes" ;
    }
    public void exit(){
        this.CheckIn = "No" ;
    }
}
