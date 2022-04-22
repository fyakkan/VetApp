package com.example.dynamic_design;

public class Pet {
    private String name;
    private String type;
    private String age;
    private String sex;

    private static int counter = 0;

    private int petId;

    Pet() {
        this.petId = counter++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return petId;
    }

    public void setId(int id) {
        this.petId = id;
    }
}
