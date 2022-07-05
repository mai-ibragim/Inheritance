package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName=groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                "} " + super.toString();
    }

    void dancing() {
        System.out.println("Dancer is dancing");
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
