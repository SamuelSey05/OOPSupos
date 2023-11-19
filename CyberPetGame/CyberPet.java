package CyberPetGame;

abstract class CyberPet {
    protected  int hungerPoints;
    protected  int stamina;
    protected  int maxStamina;
    protected int maxHunger;
    protected String name;

    public String getName() {
        return name;
    }
    public int getHungerPoints() {
        return hungerPoints;
    }

    public int getMaxHunger() {
        return maxHunger;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    public int getStamina() {
        return stamina;
    }

    public abstract boolean feed();
    public abstract boolean sleep();
    public abstract void play();
    public abstract String getState();
}

