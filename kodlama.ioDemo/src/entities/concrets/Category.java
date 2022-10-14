package entities.concrets;

import entities.abstracts.Entity;

public class Category extends Entity {

    private String name;

    public Category(int id, String name) {
        super.id = id;
        this.name = name;
    }
    public Category(){

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
}
