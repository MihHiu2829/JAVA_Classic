package MVC_Jtext_Area_2.Model;

public class jTextArea_model {
    private String vanBan ;
    private String tuKhoa ;
    private String ketQua ;

    public jTextArea_model() {
        this.vanBan = "";
        this.tuKhoa = "";
        this.ketQua = "";
    }

    public String getVanBan() {
        return vanBan;
    }

    public void setVanBan(String vanBan) {
        this.vanBan = vanBan;
    }

    public String getTuKhoa() {
        return tuKhoa;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    public void timkiem(){
        int vitri = 0  ;
        int dem = 0 ;
        while(true){
            int i = this.vanBan.indexOf(tuKhoa,vitri) ;
            if(i==-1) break ;
            else {
                  vitri = i+ 1;
                  dem++;
            }
        }
        this.ketQua = "Thống kê có "+ dem +" từ: "+ this.tuKhoa ;
    }
}

