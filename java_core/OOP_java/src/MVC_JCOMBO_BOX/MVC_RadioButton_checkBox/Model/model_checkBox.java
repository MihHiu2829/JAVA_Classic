package MVC_JCOMBO_BOX.MVC_RadioButton_checkBox.Model;

import java.util.StringTokenizer;

public class model_checkBox {
    private String luachon_MonCHinh ;
    private String luachon_MonPhu ;
    private double tongTien ;

    public model_checkBox() {
        this.luachon_MonCHinh = "";
        this.luachon_MonPhu = "";
        this.tongTien = 0 ;
    }

    public String getLuachon_MonCHinh() {
        return luachon_MonCHinh;
    }

    public void setLuachon_MonCHinh(String luachon_MonCHinh) {
        this.luachon_MonCHinh = luachon_MonCHinh;
    }

    public String getLuachon_MonPhu() {
        return luachon_MonPhu;
    }

    public void setLuachon_MonPhu(String luachon_MonPhu) {
        this.luachon_MonPhu = luachon_MonPhu;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void tinhTongTien() {
             this.tongTien = 0 ;
            if(this.luachon_MonCHinh.equalsIgnoreCase("Com")){
                tongTien += 20000;
            }else if(this.luachon_MonCHinh.equalsIgnoreCase("Pho")){
                tongTien += 50000 ;
            }else if(this.luachon_MonCHinh.equalsIgnoreCase("Banh Mi"))
                tongTien += 15000 ;


        StringTokenizer stk = new StringTokenizer(this.luachon_MonCHinh," ");
        while(stk.hasMoreElements()) {
            String monPhu = stk.nextToken();
            monPhu = monPhu.trim();
            if (monPhu.equalsIgnoreCase("Tra sua"))
                tongTien += 50000;
            if (monPhu.equalsIgnoreCase("Cocacola"))
                tongTien += 12000;
            if (monPhu.equalsIgnoreCase("Banh ngot"))
                tongTien += 50000;
            if (monPhu.equalsIgnoreCase("Nem"))
                tongTien += 20000;
        }
}

}
