package com.company;

public class Can {
    private int radius;
    private int height;
    private double surfaceArea;
    private double volume;

    Can(int radius, int height) {
        this.radius = radius;
        this.height = height;
        surfaceArea = (2*(Math.PI * (radius*radius)) + ((2*Math.PI*radius)*height));
        volume = (Math.PI * (radius*radius) * height);

    }
    //getter

    public double getSurfaceArea() {
        return surfaceArea;
    }
    public double getVolume() {
        return volume;
    }
}
