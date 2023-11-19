package CyberPetGame;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Pets {
    private List<CyberPet> petList;

    public Pets() {
        petList = new ArrayList<CyberPet>();
    }
    public String namePet(int i) {
        return petList.get(i).getName();
    }
    public boolean feedPet(int i) {
        return petList.get(i).feed();
    }
    public boolean sleepPet(int i) {
        return petList.get(i).sleep();
    }
    public void playPet(int i) {
        petList.get(i).play();
    }
    public void statePet(int i) {
        System.out.println(petList.get(i).getState());
        System.out.println("Select what you would like to do with your pet (1 - feed, 2 - sleep, 3 - play, 4 - nothing)");
    }
    public int addPet(CyberPet x) {
        petList.add(x);
        return petList.indexOf(x);
    }
    public void killPet(int i) {
        petList.remove(i);
    }
    public void displayPets() {
        for (int i = 0; i < petList.size(); i++) {
            System.out.println((i+1) + ": " + petList.get(i).getState());
        }
    }
    public int getLength(){
        return petList.size();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the CyberPet game");
        Pets petList = new Pets();

        System.out.println("Would you like to play? (1/2)");
        int choice = Integer.parseInt(reader.nextLine());
        while (choice == 1) {
            System.out.println("Here are your pets:");
            petList.displayPets();

            System.out.println("Would you like to add a new pet? (1/2)");
            choice = Integer.parseInt(reader.nextLine());

            int index;

            if (choice == 1) {
                System.out.println("What pet would you like to add? (1 - Dog, 2 - Fish, 3 - Ninja)");
                choice = Integer.parseInt(reader.nextLine());

                System.out.println("What would you like to name your pet?");
                String name = reader.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("What breed would you like your dog? (1 - Chihuahua, 2 - Terrier, 3 - Doberman)");
                        choice = Integer.parseInt(reader.nextLine());
                        switch (choice) {
                            case 1:
                                index = petList.addPet(new Dog(name, "Chihuahua"));
                                break;
                            case 2:
                                index = petList.addPet(new Dog(name, "Terrier"));
                                break;
                            case 3:
                                index = petList.addPet(new Dog(name, "Doberman"));
                                break;
                        }
                        break;
                    case 2:
                        petList.addPet(new Fish(name));
                        break;
                    case 3:
                        petList.addPet(new Ninja(name));
                        break;
                }
            } else {
                petList.displayPets();

                System.out.println("Select the pet you would like to interact with by typing the number next to their name.");
                int i = Integer.parseInt(reader.nextLine());
                choice = 1;

                while (choice == 1) {
                    petList.statePet(i - 1);
                    choice = Integer.parseInt(reader.nextLine());

                    switch (choice) {
                        case 1:
                            if (petList.feedPet(i-1)) {
                                petList.killPet(i-1);
                                choice = 2;
                            } else {
                                System.out.println("Would you like to stay with this pet? (1/2)");
                                choice = Integer.parseInt(reader.nextLine());
                            }
                            break;
                        case 2:
                            if (petList.sleepPet(i-1)) {
                                petList.killPet(i-1);
                                choice = 2;
                            } else {
                                System.out.println("Would you like to stay with this pet? (1/2)");
                                choice = Integer.parseInt(reader.nextLine());
                            }
                            break;
                        case 3:
                            petList.playPet(i-1);
                            System.out.println("Would you like to stay with this pet? (1/2)");
                            choice = Integer.parseInt(reader.nextLine());
                            break;
                    }
                }
            }
            System.out.println("Would you like to continue playing? (1/2)");
            choice = Integer.parseInt(reader.nextLine());
        }
    }
}
