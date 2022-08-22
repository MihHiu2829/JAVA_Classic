package TuDien;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class tuuDien {
    private Map<String, String>tudien = new TreeMap<String,String>() ;
    public void themtukhoa(String key,String values){
        this.tudien.put(key,values) ;
    }
    public int soluong(){
        return this.tudien.size() ;
    }
    public String traTu(String key){
        return this.tudien.get(key) ;
    }
    public String xoa1tu(String key){
         return   this.tudien.remove(key);
    }
    public void xoahet(){
        this.tudien.clear();
    }

}
