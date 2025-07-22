package org.example;

public abstract class airplane extends Transport implements Nebo {
private final boolean wings;

    public airplane(String name, boolean engine, boolean wings) {
        super(name, engine);
        this.wings = wings;


    }
    @Override
    public void fly() {
        System.out.println("I am fly, like a bird");
    }
}
