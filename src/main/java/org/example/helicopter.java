package org.example;

public class helicopter extends Transport implements Nebo {
    private final String wheels;
    private final String blades;
    public final int carrier;

    public helicopter(String name, boolean engine, String wheels, String blades, int carrier) {
        super(name, engine);
        this.wheels = wheels;
        this.blades = blades;
        this.carrier = carrier;
    }

    @Override
    public void fly() {
        System.out.println(" I am king of skyes! ");
    }
}
