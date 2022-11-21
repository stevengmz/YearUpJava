package com.yearup.week2.homework;


import com.sun.net.httpserver.Authenticator;

import java.util.Scanner;

import static com.yearup.week2.homework.Executer.PlanetName.checkPlanet;
import static java.lang.String.valueOf;

public class Executer {
    static Scanner sc = new Scanner(System.in);
    static SolarSystem solar = new SolarSystem() {
        @Override
        public String getStar() {
            return getStar;
        }
    };

    public static String planetname() {
        System.out.println("Enter Planet Name: ");
        String planetname = sc.nextLine();
        return planetname;
    }


    public static double planetRadius() {
        System.out.println("Enter the planet radius: ");
        double planetRadius = sc.nextDouble();
        return planetRadius;
    }

    public static void displayAreaofSq(double area) {
        System.out.println("The Area of the planet is " + area);

    }

    public static void getStar(SolarSystem StarofSolar) {
        System.out.println("The Star of the planet is " + StarofSolar.getStar());
    }

    public static void Pos(SolarSystem planet, String planetName) {
        int position = solar.Pos(planetName);
        System.out.println("The position of the planet is " + position);
    }

    public static void main(String[] args) {
        boolean Restart = false;
        String planetname = planetname();
        double planetRadius = planetRadius();
        double planetArea = solar.area(planetRadius);
        displayAreaofSq(planetArea);
        getStar(solar);
        Pos(solar, planetname);


        System.out.println("Would you like to retry with another planet?");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("Yes")) {
            ;
            Restart = true;

        } else {
            System.out.println("Thanks for using our planet application. Goodbye!");
        }
    }

    static class CelestialObject implements Calculator {

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

        @Override
        public void displayCelestialobject() {
            System.out.println("Comet is a celestial object");

        }
    }

    public static class Milkyway {
        public static void milkyway() {
            System.out.println("Your planet belongs to the Milkyway");
        }
    }

    enum PlanetName {
        Mercury(0),
        Venus(0),
        Earth(1),
        Mars(2),
        Jupiter(80),
        Saturn(83),
        Uranus(27),
        Neptune(14),
        ;

        public static int moons;

        PlanetName(int Planetmoons) {
            this.moons = Planetmoons;

        }

        public static void checkPlanet(String s) {
            int moon = moons(PlanetName.valueOf(s));
            System.out.println(s + " has " + moon + " moons");
            Milkyway.milkyway();

        }

        private static int moons(PlanetName valueOf) {
            return 0;
        }


    }
}

