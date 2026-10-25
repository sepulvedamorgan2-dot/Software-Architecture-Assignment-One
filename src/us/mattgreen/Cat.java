package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by mgreen14 on 12/28/17.
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    public int getMousesKilled() {
        return mousesKilled;
    }

    public void addMouse() {
        mousesKilled++;
    }
    public static Cat createCat(Scanner scanner) {


        System.out.println("Name of your cat:");
        String name = scanner.nextLine();

        System.out.println("How many mice slain:");
        int slainedMice = scanner.nextInt();

        return new Cat(slainedMice, name);
    }

    @Override
    public String talk() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

