package entities.concrets;

import entities.abstracts.Entity;

public class Course extends Entity {
    private String name;
    private String detail;

    public Course(){

    }
    public Course(int id,String name,String detail){
        super.id=id;
        this.name=name;
        this.detail=detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        super.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
