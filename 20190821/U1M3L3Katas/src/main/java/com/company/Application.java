package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        int petIndex=0;
   do {


    try {
        System.out.println("Current saved animals file:");
        Pets.readPetsFromFile();

        petIndex = Pets.choosePet();

        String chosenPet = Pets.retrievePet(petIndex);

        Pets.writePetToFile(chosenPet);

        System.out.println("New saved animals file:");
        Pets.readPetsFromFile();
    }catch(NumberFormatException e){
        System.out.println("Please enter a valid number.");
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Please choose an available pet.");
    }catch (FileNotFoundException e){
        System.out.println("The following file does not seem to exist: \" + e.getMessage()");
    }catch(IOException e){
        System.out.println("ERROR: Could not write to file: \" + e.getMessage()");
    }
   }while(petIndex < 0 || petIndex > 5);
        System.out.println( "Have a nice day!");
    }
}
