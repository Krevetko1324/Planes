package org.example;

public class Boat extends Transport implements Water {
    public static int maneuverability;
    private final String helix;
    public static int carrier;

    @Override
    public void swimming() {
        System.out.println("I am so fast");

    }

    public Boat(String name, boolean engine, int maneuverability, String helix, int carrier) {
        super(name, engine);
        Boat.maneuverability = maneuverability;
        this.helix = helix;
        Boat.carrier = carrier;

    }
}
