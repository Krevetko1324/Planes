package org.example;

public class tanker extends Transport implements Water{
   pu
    @Override
    public void swimming() {
        System.out.println(" I am big and slow, but have armor");
    }
    public tanker(String name, boolean engine) {
        super(name, engine);
    }
}
