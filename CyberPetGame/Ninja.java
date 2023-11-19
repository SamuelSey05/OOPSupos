package CyberPetGame;

public class Ninja extends CyberPet{
    private int numberOfShurikens;
    public Ninja(String n) {
        name = n;
        stamina = 30;
        maxStamina = 30;
        hungerPoints = 30;
        maxHunger = 30;
        System.out.println(name + " the Ninja has stamina: " + stamina + "/" + maxStamina + "  hunger: " + hungerPoints + "/" + maxHunger);
    }
    @Override
    public boolean feed() {
        hungerPoints += 7;
        if (hungerPoints > maxHunger) {
            hungerPoints = maxHunger;
            System.out.println(name + " the Ninja is full and ready for action.");
        } else {
            System.out.println("おいしい");
        }
        return false;
    }
    @Override
    public boolean sleep() {
        stamina += 10;;
        numberOfShurikens += 5;
        if (stamina > maxStamina) {
            System.out.println(name + " the Ninja got caught by a Samurai. They have died.");
            return true;
        } else {
            System.out.println("私はよく休んでいます");
            return false;
        }
    }
    @Override
    public void play() {
        if (stamina < 5) {
            System.out.println(name + " the Ninja is too tired to play. Let them rest.");
        } else if (hungerPoints < 5) {
            System.out.println(name + " the Ninja is too hungry to play. Let them eat.");
        } else if (numberOfShurikens < 1) {
            System.out.println(name + " the Ninja has no shurikens. Get them some.");
        } else {
            System.out.println("敵を攻撃しましょう");
            stamina -= 5;
            hungerPoints -= 5;
            numberOfShurikens -= 1;
        }
    }
    @Override
    public String getState(){
        return ("忍者は秘密を明かさない");
    }
}
