package org.example;

public class truck extends Transport implements Aland {
    private String wheels = "Truck Wheels";
    public static int carrier;

    @Override
    public void riding() {
        System.out.println("Yeah im gonna take my horse");
    }

    public truck(String name, boolean engine, int carrier, String Wheels) {
        super(name, engine);
        this.carrier = carrier;
        this.wheels = wheels;


    }
}
