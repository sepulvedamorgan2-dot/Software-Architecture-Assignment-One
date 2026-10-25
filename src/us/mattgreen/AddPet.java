package us.mattgreen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Created by Morgan Sepulveda
 */
public class AddPet{
    private ArrayList<Talkable> animalList;

    public AddPet(ArrayList<Talkable> animalList) {
        this.animalList = animalList;

    }
    public static void AddNewPet(ArrayList<Talkable> animalList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal would you like to add?");
        System.out.println("1. Cat");
        System.out.println("2. Dog");
        int userInput = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You entered: " + userInput);

        if(userInput == 1){

            animalList.add(Cat.createCat(scanner));
        } else if(userInput ==2){
            animalList.add(Dog.createDog(scanner));
        }

    }







}