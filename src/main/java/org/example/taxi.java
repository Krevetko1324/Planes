package org.example;

public class taxi extends Transport implements Aland {
    private final boolean wheels;

    @Override
    public void riding() {

        System.out.println("Я гоню быстро, не подьедешь близко");
    }

    public taxi(String name, boolean engine, boolean wheels) {
        super(name, engine);
        this.wheels = wheels;
    }
}
