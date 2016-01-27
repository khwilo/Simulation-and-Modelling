/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicerolling;

/**
 *
 * @author Khwilo
 */
import java.util.Random;

public class DiceRolling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random randomNum = new Random();
        int[] array = new int[7];
       
        // Roll the die 1000 times
        int rolls;
        for (rolls = 1; rolls <= 1000; rolls++) {
            ++array[ 1 + randomNum.nextInt(6)];
            
        }
        
        System.out.printf("%5s%12s%12s\n", "Face", "Frequency", "Percentage");
        System.out.println("-----------------------------");
        double totalPerc = 0;
        for (int faces = 1; faces < array.length ; faces++) {
            double percentage = (double) (array[faces]) / 10;
            String perc = String.format("%.1f", percentage);
            totalPerc += percentage;
            System.out.printf("%4d%10d%11s\n", faces, array[faces], perc);
        }
        
        int frequencies = 0;
        for (int num : array) {
            frequencies += num;
        }
        
        String percentage = String.format("%.0f", totalPerc);
        System.out.println("-----------------------------");
        System.out.printf("%5s%9d%9s \n:", "TOTAL ", frequencies, percentage);
    }
    
}
