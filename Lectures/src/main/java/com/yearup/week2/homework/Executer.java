package Lectures.src.main.java.com.yearup.week2.homework;


import com.sun.net.httpserver.Authenticator;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Executer {
    static Scanner sc = new Scanner(System.in);
    static SolarSystem solar = new SolarSystem() {
        @Override
        public String getStar() {
            return getStar;
        }
    };

    public static String planetname(){
        System.out.println("Enter Planet Name: ");
        String planetname = sc.nextLine();
        return planetname;
    }


    public static double planetRadius(){
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

        }
        else {
            System.out.println("Thanks for using our planet application. Goodbye!");
        }
    }
}

