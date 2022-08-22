package MVC_JscrollArea.Model;

public class model_ScrollPanel {
    private String text  ;
    private String keyword ;
    private String result ;

    public model_ScrollPanel() {
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
        int vitri = 0   , dem = 0  ;
        while(true){
            int i = this.text.indexOf(this.keyword,vitri) ;
            if(i==-1) break ;
            else {
                 dem++ ;
                 vitri = i+1 ;
            }
        }
        this.result = "Kết quả: "+ dem +" từ "+ this.keyword ;
    }
}
