package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {

   // Create a program that asks the user how many pets they have.
    // Once you know how many pets they have, ask them what kind of pet each one is, along with each pet's name.
    // For now your program should just hold onto the user input and print out the list at the end; we'll modify this in part 3.


    public static void main(String[] args){
        ArrayList<Pet> pets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, how many pets do you have?");
        int numberOfPets =  scanner.nextInt();
        for(int i = 0; i< numberOfPets; i++){
            System.out.println("Can you tell me what kind of pet "+ i +  " is?\n");
            String typeOfPets =  scanner.next();
            System.out.println("All right, what is names of the pet "+ i+ " ?\n");
            String nameOfPets =  scanner.next();
            if(typeOfPets.equals("Cat")){
                Cat cat = new Cat(nameOfPets);
                pets.add(cat);
            }
            else if(typeOfPets.equals("Dog")) {
                Dog dog = new Dog(nameOfPets);
                pets.add(dog);

            }
            else if(typeOfPets.equals("Cow")) {
               Cow cow = new Cow(nameOfPets);
                pets.add(cow);

            }
            else{
                System.out.println("Incorrect pet type");
            }

        }
        for(Pet p: pets){
            System.out.println( p.getName() +" : " +p.speak());
        }

    }
}
