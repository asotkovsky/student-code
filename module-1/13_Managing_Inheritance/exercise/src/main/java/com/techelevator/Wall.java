package com.techelevator;

public abstract class Wall {

    // Member variables

    private String name;
    private String color;

    // Constructor

    public Wall(String name, String color){
        this.name = name;
        this.color = color;
    }


    // getArea method

    public abstract int getArea();

    // Other getters


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

}
