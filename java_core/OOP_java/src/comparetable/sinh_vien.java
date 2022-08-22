package comparetable;

public class sinh_vien implements  Comparable<sinh_vien> {
    private int mssv ;
    private String name ;
    private String date ;
    private float pointAVG ;

    public sinh_vien(int mssv, String name, String date, float pointAVG) {
        this.mssv = mssv;
        this.name = name;
        this.date = date;
        this.pointAVG = pointAVG;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getPointAVG() {
        return pointAVG;
    }

    public void setPointAVG(float pointAVG) {
        this.pointAVG = pointAVG;
    }
     public String getName(sinh_vien z){
        String s = z.name ;
        s = s.trim();
        int local = s.lastIndexOf(" ") ;
        if(local >= 0) {
            String ss = s.substring(local+1)  ;
            return ss;
        }
        return s   ;
     }
    @Override
    public int compareTo(sinh_vien o) {
        String a = this.getName(this)  ;
        String b = o.getName(o) ;
        return a.compareTo(b);
    }
}
