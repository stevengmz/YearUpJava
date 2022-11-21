
package com.yearup.week2.homework;
public abstract class Planet implements Calculator {
    protected String getStar;

    String planetname;
    Double planetRadius;

    public double area(double planetRadius){
        return (3.14*planetRadius*planetRadius);
    }


    @Override
    public double area(double length, double width) {
        return 0;
    }

    @Override
    public double sum(double length, double width) {
        return 0;
    }

    @Override
    public double volume(double length, double width, double height) {
        return 0;
    }

    public abstract String getStar();
}

