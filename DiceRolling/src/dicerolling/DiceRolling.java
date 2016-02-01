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
import java.security.SecureRandom;

public class DiceRolling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom randomNum = new SecureRandom();
        /*
         * Array of frequency counters.
         * Occurences of each side of the die.
         * Note: frequency[0] is ignored.
        */
        int[] frequency = new int[7];
       
        // Roll the die 1000 times
        int rolls;
        for (rolls = 1; rolls <= 1000; rolls++) {
            /*
             * Determine which frequency element to increment at each iteration of the loop
            */
            ++frequency[ 1 + randomNum.nextInt(6)];
            
        }
        
        System.out.printf("%5s%12s%12s\n", "Face", "Frequency", "Percentage");
        System.out.println("-----------------------------");
        double totalPercentage = 0;
        for (int face = 1; face < frequency.length ; face++) {
            double percentage = (double) (frequency[face]) / 10;
            String perc = String.format("%.1f", percentage);
            totalPercentage += percentage;
            System.out.printf("%4d%10d%11s\n", face, frequency[face], perc);
        }
        
        int frequencies = 0;
        for (int num : frequency) {
            frequencies += num;
        }
        
        String percentage = String.format("%.0f", totalPercentage);
        System.out.println("-----------------------------");
        System.out.printf("%5s%9d%9s \n:", "TOTAL ", frequencies, percentage);
    }
    
}
