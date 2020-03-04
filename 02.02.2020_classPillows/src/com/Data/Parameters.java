package com.Data;

public class Parameters {
    public String outsideMaterial;
    public String insideMaterial;
    public double width;
    public double length;

    @Override
    public String toString() {
        return "Parameters{" +
                "outsideMaterial='" + outsideMaterial + '\'' +
                ", insideMaterial='" + insideMaterial + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public Parameters(String outsideMaterial, String insideMaterial, double width, double length) {
        this.outsideMaterial = outsideMaterial;
        this.insideMaterial = insideMaterial;
        this.width = width;
        this.length = length;


    }
}
