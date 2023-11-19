package CyberPetGame;

public class Fish extends CyberPet{
    public Fish(String n) {
        name = n;
        stamina = 4;
        maxStamina = 4;
        hungerPoints = 4;
        maxHunger = 4;
    }
    @Override
    public boolean feed() {
        hungerPoints += 1;
        if (hungerPoints > maxStamina) {
            System.out.println(name + " the Fish is too full, they die.");
            return true;
        } else {
            System.out.println("Blub Blub MMMMMMMMM. Time for bed.");
            stamina = 0;
            return false;
        }
    }
    @Override
    public boolean sleep() {
        stamina += 2;
        if (stamina > maxStamina) {
            stamina = maxStamina;
            System.out.println(name + "the Fish is not tired anymore. Play with them.");
        } else {
            System.out.println("ZZZZZZZZ");
        }
        return false;
    }
    @Override
    public void play() {
        if (stamina < 2) {
            System.out.println("Cannot play with " + name + " the Fish. They are too tired.");
        } else if (hungerPoints < 4) {
            System.out.println("Cannot play with " + name + " the Fish. They are too hungry.");
        } else {
            System.out.println("BLUB BLUB BLUB BLUB");
        }
    }
    @Override
    public String getState() {
        return (name + " the Fish has stamina: " + stamina + "/" + maxStamina + "  hunger: " + hungerPoints + "/" + maxHunger);
    }
}
