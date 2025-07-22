package org.example;

public abstract class Airplane extends Transport implements Sky {
    private final boolean wings;
    private final String wheels;
    private final String helix;
    public final int carrier;

    public Airplane(String name, boolean engine, boolean wings, String wheels, String helix, int carrier) {
        super(name, engine);
        this.wings = wings;
        this.wheels = wheels;
        this.helix = helix;
        this.carrier = carrier;
    }

    @Override
    public void fly() {
        System.out.println("I am fly, like a bird");
    }
}
