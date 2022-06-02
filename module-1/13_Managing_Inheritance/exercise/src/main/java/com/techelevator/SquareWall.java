package com.techelevator;

public class SquareWall extends RectangleWall {

    private int sideLength;

    // Constuctor

    public SquareWall(String name, String color, int sideLength){
        super(name, color);
        this.sideLength = sideLength;
    }

    // Methods

    public int getArea() {
        return this.sideLength * this.sideLength;
    }

    @Override
    public String toString(){
        return getName() + " (" + this.sideLength + "x" + this.sideLength + ") " + "square";
    }

}
