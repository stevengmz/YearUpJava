package com.yearup.week2.homework;


import java.util.Scanner;

public class CalcClass implements Calculator{
    private double AreaofSq;
    private double thelength;

    public double area(double length, double width){
        this.AreaofSq = length*width;
        return this.AreaofSq;

    }
    public void displayAreaofSq() {
        System.out.println(" The area of the sq is:" + AreaofSq);
    }
    public void setThelength(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length value:");
        this.thelength = sc.nextDouble();
    }

    @Override
    public double sum(double length, double width) {
        double sum = length+width;
        System.out.println("The sum is " + sum);
        return sum;
    }

    @Override
    public double volume(double length, double width, double height) {
        double volume = length*width*height;
        System.out.println("The volume is " + volume);
        return volume;
    }
    public static void main(String[] args) {

        CalcClass areacal = new CalcClass();
        areacal.setThelength();
        double squareArea = areacal.area(areacal.thelength, areacal.thelength);
        areacal.displayAreaofSq();


    }
}
