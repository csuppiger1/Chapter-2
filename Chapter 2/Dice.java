


/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
public class Dice
{
    public static void main(String[] args) {
        int firstDie, secondDie;
        int sumOfDie;
        
        Random generator = new Random();
        
        firstDie = generator.nextInt(6) + 1;
        secondDie = generator.nextInt(6) + 1;
        
        sumOfDie = firstDie + secondDie;
        
        System.out.println("The first die landed on " + firstDie);
        System.out.println("The second die landed on " + secondDie);
        System.out.println("Your score is " + sumOfDie);
        
    }
}
