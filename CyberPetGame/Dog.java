package CyberPetGame;

public class Dog extends CyberPet{
    private final String breed;

    public Dog(String n, String b) {
        name = n;
        breed = b;
        switch (breed) {
            case "Chihuahua":
                stamina = 20;
                hungerPoints = 5;
                maxHunger = 5;
                maxStamina = 20;
                break;
            case "Terrier":
                stamina = 15;
                hungerPoints = 10;
                maxHunger = 10;
                maxStamina = 15;
                break;
            case "Doberman":
                stamina = 25;
                hungerPoints = 25;
                maxHunger = 25;
                maxStamina = 25;
                break;
        }
    }
    @Override
    public boolean feed() {
        hungerPoints +=5;
        if (hungerPoints > maxHunger) {
            hungerPoints = maxHunger;
            System.out.println("Oh no, " + name + " the " + breed + " is full now. Time for bed.");
            stamina = 0;
        } else {
            System.out.println("MMMMMMMMMM WOOOF WOOF");
        }
        return false;
    }
    @Override
    public boolean sleep() {
        if (stamina == maxStamina){
            System.out.println("Oh no, " + name + " the " + breed + " is not tired. Play with them for a bit");
        } else {
            System.out.println("ZZZZWOOFZZZZ");
        }
        stamina = maxStamina;
        return false;
    }
    @Override
    public void play() {
        if (stamina < 5) {
            System.out.println(name + " the " + breed + " is too tired to play. Give them some sleep.");
        } else if (hungerPoints < 5) {
            System.out.println(name + " the " + breed + " is too hungry to play. Give them some food.");
        } else {
            System.out.println("WOOOF WOOF SO FUN");
        }
    }
    @Override
    public String getState() {
        return (name + " the " + breed + " has stamina: " + stamina + "/" + maxStamina + "  hunger: " + hungerPoints + "/" + maxHunger);
    }
}
