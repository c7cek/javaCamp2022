package entities.concrets;

import entities.abstracts.Entity;

public class Instructor extends Entity {
    private String name;
    private String branch;

    public Instructor(int id, String name, String branch) {
        super.id = id;
        this.name = name;
        this.branch = branch;
    }
    public Instructor(){

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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
