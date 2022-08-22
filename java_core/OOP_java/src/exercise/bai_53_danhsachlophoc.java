package exercise;

import java.util.ArrayList;

public class bai_53_danhsachlophoc {
   private  ArrayList<bai_53_lopHoc>dslh = new ArrayList<bai_53_lopHoc>() ;
    public bai_53_danhsachlophoc() {
        bai_53_lopHoc lh = new bai_53_lopHoc();
    }
    public void themLopHoc(bai_53_lopHoc lh){
        dslh.add(lh);
    }


}
