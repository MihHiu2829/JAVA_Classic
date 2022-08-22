package OOP_7;

import java.util.Objects;

public class Student {
      private String name ;
      private String code ;
      private Date date ;
      private double point_ave ;
      Class Class ;

    public Student(String name, String code, Date date, double point_ave, OOP_7.Class aClass) {
        this.name = name;
        this.code = code;
        this.date = date;
        this.point_ave = point_ave;
        Class = aClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPoint_ave() {
        return point_ave;
    }

    public void setPoint_ave(double point_ave) {
        this.point_ave = point_ave;
    }

    public void setClass(OOP_7.Class aClass) {
        Class = aClass;
    }
    public String groupNameofLearning(){
        return this.Class.getNameGruop()   ;
    }
    public boolean check(){
        return this.point_ave >= 5 ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return date.equals(student.date);
    }

    @Override
    public int hashCode() {
        return date.hashCode();
    }
}
