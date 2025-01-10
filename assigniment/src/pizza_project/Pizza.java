package pizza;

import java.util.Random;

class Pizza {
    private int numSlices;
    private MeatChoice meatChoice;
    private VegChoice vegChoice;

    // Default Constructor
    public Pizza() {
        Random random = new Random();
        this.numSlices = random.nextInt(8) + 1; // Random slices between 1 and 8
        this.meatChoice = MeatChoice.values()[random.nextInt(MeatChoice.values().length)];
        this.vegChoice = VegChoice.values()[random.nextInt(VegChoice.values().length)];
    }

    public Pizza(int numSlices, MeatChoice meatChoice, VegChoice vegChoice) {
        this.numSlices = numSlices;
        this.meatChoice = meatChoice;
        this.vegChoice = vegChoice;
    }

    public int getNumSlices() {
        return numSlices;
    }

    public void setNumSlices(int numSlices) {
        this.numSlices = numSlices;
    }

    public MeatChoice getMeatChoice() {
        return meatChoice;
    }

    public void setMeatChoice(MeatChoice meatChoice) {
        this.meatChoice = meatChoice;
    }

    public VegChoice getVegChoice() {
        return vegChoice;
    }

    public void setVegChoice(VegChoice vegChoice) {
        this.vegChoice = vegChoice;
    }

    // toString Method
    @Override
    public String toString() {
        return "Pizza{" +
                "numSlices=" + numSlices +
                ", meatChoice=" + meatChoice +
                ", vegChoice=" + vegChoice +
                '}';
    }
}


