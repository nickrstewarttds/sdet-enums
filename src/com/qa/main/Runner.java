package com.qa.main;

public class Runner {

    public static void main(String[] args) {

        // see how we can access specific constants globally?
        // we don't instantiate them because they're not classes - we instead refer to their values directly
        System.out.println(Planets.EARTH);
        System.out.println(Planets.EARTH.getMass());

        // each constant we make contains all the methods defined inside the enum object - like getMass()
        for (Planets p : Planets.values()) {
            System.out.println("Mass of " + p + " is: " + p.getMass());
        }

    }

}
