package MVC_Jtext_Area_3.Model;

public class JtextArea_model {
    private  String text   ;
    private String keyword ;
    private  String result ;

    public JtextArea_model() {
        this.text = "" ;
        this.keyword = "" ;
        this.result = "" ;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void timkiem(){
        int dem = 0 , vitri =  0  ;
        while(true){
            int i = this.text.indexOf(this.keyword,vitri);
            if(i==-1) break ;
            else {
                vitri =  i  + 1 ;
                dem++   ;
            }
        }
        this.result = "Kết quả có: "+ dem +" "+ this.keyword ;
    }
}
