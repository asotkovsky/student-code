package com.techelevator;

public class RectangleWall extends Wall {

    // Instance variables
    private int length;
    private int height;

    // Getters

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    // Constructors

    public RectangleWall(String name, String color, int length, int height){
        super(name, color);
        this.length = length;
        this.height = height;
    }

    public RectangleWall(String name, String color){
        super(name, color);
    }

    // Implementation of getArea() method

    public int getArea(){
        return this.length * this.height;
    }

    // toString() method

    @Override
    public String toString(){
        return getName() + " (" + this.length + "x" + this.height + ") " + "rectangle";
    }

}
