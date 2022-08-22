package MVC_JCombobox_JList.model;

import java.util.StringTokenizer;

public class radio_model {
    private String monAnChinh ;
    private String monAnPhu ;
    private double tongTien ;

    public radio_model() {
        this.monAnChinh ="" ;
        this.monAnPhu = "" ;
        this.tongTien = 0  ;
    }

    public String getMonAnChinh() {
        return monAnChinh;
    }

    public void setMonAnChinh(String monAnChinh) {
        this.monAnChinh = monAnChinh;
    }

    public String getMonAnPhu() {
        return monAnPhu;
    }

    public void setMonAnPhu(String monAnPhu) {
        this.monAnPhu = monAnPhu;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    public void TinhTongTien() {
        this.tongTien = 0;
        if (this.monAnChinh.equalsIgnoreCase("Com")) {
            tongTien += 39000;
        } else if (this.monAnChinh.equalsIgnoreCase("Banh mi"))
            tongTien += 22000;
        else if (this.monAnChinh.equalsIgnoreCase("Pho"))
            tongTien += 37000;


        StringTokenizer stk = new StringTokenizer(this.monAnPhu, ";") ;
        while(stk.hasMoreElements()){
            String monPhu = stk.nextToken() ;
            monPhu = monPhu.trim() ;
            if (monPhu.equalsIgnoreCase("Tra sua"))
                    tongTien += 25000 ;
            if (monPhu.equalsIgnoreCase("Co ca"))
                tongTien += 12000 ;
            if (monPhu.equalsIgnoreCase("Banh Ngot"))
                tongTien += 10000 ;
            if (monPhu.equalsIgnoreCase("Kem"))
                tongTien += 28000 ;
        }
    }
}
