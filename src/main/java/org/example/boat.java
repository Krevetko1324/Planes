package org.example;

public class boat extends Transport implements Water{
    public static int maneuverability;
    private final String helix;
    public static int carrier;
    @Override
    public void swimming() {
        System.out.println("I am so fast");

    }

    public boat(String name, boolean engine, int maneuverability, String helix, int carrier) {
        super(name, engine);
        boat.maneuverability = maneuverability;
        this.helix = helix;
        boat.carrier = carrier;

    }
}
