package org.example;

public class Taxi extends Transport implements Aland {
    private final boolean wheels;

    @Override
    public void riding() {

        System.out.println("Я гоню быстро, не подьедешь близко");
    }

    public Taxi(String name, boolean engine, boolean wheels) {
        super(name, engine);
        this.wheels = wheels;
    }
}
