package org.example;

public class tanker extends Transport implements Water{
    public static int carrier;
    private final String helix;

    @Override
    public void swimming() {
        System.out.println(" I am big and slow, but have armor");
    }
    public tanker(String name, boolean engine, int carrier, String helix) {

        super(name, engine);
        this.helix = helix;
        tanker.carrier = carrier;
    }

}
