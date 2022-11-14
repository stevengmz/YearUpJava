package Lectures.src.main.java.com.yearup.week2.homework;

import java.util.Scanner;

public class SolarSystem extends Planet {
    String StarofSolar = "SUN";

    public void PositionofPlanet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Planet:");
        String Planet = sc.next();
    }

    @Override
    public String getStar() {
        return getStar;
    }

    protected int Pos(String Planet) {
        switch (Planet) {
            case "Mercury":
                return 1;
            case "Venus":
                return 2;
            case "Earth":
                return 3;
            case "Mars":
                return 4;
            case "Jupiter":
                return 5;
            case "Saturn":
                return 6;
            case "Uranus":
                return 7;
            case "Neptune":
                return 8;


        }
        return 0;
    }
}




