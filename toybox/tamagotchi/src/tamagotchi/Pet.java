public class Pet {

    private int hunger;
    private int happiness;
    private int energy;

    public Pet() {
        this.hunger = 50;
        this.happiness = 50;
        this.energy = 50;
    }

    // Getters
    public int getHunger() {
        return hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getEnergy() {
        return energy;
    }

    // Action methods
    public void feed() {
        hunger = Math.max(hunger - 20, 0);
    }

    public void play() {
        happiness = Math.min(happiness + 15, 100);
        energy = Math.max(energy - 10, 0);
    }

    public void sleep() {
        energy = Math.min(energy + 25, 100);
        hunger = Math.min(hunger + 10, 100); // gets hungrier while sleeping
    }

    // Tick Method
    public void tick() {
        hunger = Math.min(hunger + 5, 100);
        happiness = Math.max(happiness - 3, 0);
        energy = Math.max(energy - 2, 0);
    }

} //End of Pet class
