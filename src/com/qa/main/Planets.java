package com.qa.main;

public enum Planets {
    
    // enums are short for enumerated values - or constants!
    // the value of each enum cannot change (e.g. the stuff in all-caps, MERCURY etc)
    // they're global, so we can use them for 'immutable' - unchangeable - values across a project
    // because of this, they're not classes or interfaces, so they can't extend or implement anything
    // generally they're used for values which will never change
    
    // however, java lets you use them LIKE classes - e.g. here, where we feed each constant its own mass and radius values
    MERCURY(3.03e+23, 2.4397e6), VENUS(4.869e+24, 6.0518e6), EARTH(5.976e+24, 6.37814e6), MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7), SATURN(5.688e+26, 6.0268e7), URANUS(8.686e+25, 2.5559e7), NEPTUNE(1.024e+26, 2.4746e7);

    // they can have their own variables...
    private final double mass;
    private final double radius;

    // ...and constructors...
    Planets(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    // ...and getters/setters!
    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
    
    // (and even their own functionality - not shown here)

}