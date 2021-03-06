package com.techelevator;

public class TriangleWall extends Wall {

    private int base;
    private int height;

    //Constructor
    public TriangleWall(String name, String color, int base, int height){
        super(name, color);
        this.base = base;
        this.height = height;
    }

    //Getters

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    // Get area

    public int getArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public String toString(){
        return getName() + " (" + this.base + "x" + this.height + ") " + "triangle";
    }

}
