package us.mattgreen;

import java.util.Scanner;

/**
 * Created by mgreen14 on 12/27/17.
 */
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    public boolean isFriendly() {
        return friendly;
    }
    public static Dog createDog(Scanner scanner) {


        System.out.println("Name of your Dog:");
        String name = scanner.nextLine();

        System.out.println("Is your dog friendly?");
        System.out.println("1: Yes");
        System.out.println("2: No");
        int input = scanner.nextInt();
        boolean isDogFriendly = true;
        if(input == 2){
            isDogFriendly = false;
        }

        return new Dog(isDogFriendly, name);
    }
    @Override
    public String talk() {
        return "Bark";
    }

    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}