package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                "} " + super.toString();
    }

    void singing() {
        System.out.println("Singer is singing");
    }
    void playGuitar() {
        System.out.println("Singer is playing a Guitar");
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}
