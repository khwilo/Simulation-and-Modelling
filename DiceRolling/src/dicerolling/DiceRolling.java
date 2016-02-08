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

public class DiceRolling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int f_one = 0;
        int f_two = 0;
        int f_three = 0;
        int f_four = 0;
        int f_five = 0;
        int f_six = 0;
        
        // Roll the die 1000 times
        int rolls;
        for (rolls = 1; rolls <= 1000; rolls++) {
            double randomNum = Math.random();
            
            if(randomNum <= 1.0 / 6.0){
                f_one++;
            }else if(randomNum <= 2.0 / 6.0){
                f_two++;
            }else if(randomNum <= 3.0 / 6.0){
                f_three++;
            }else if(randomNum <= 4.0 / 6.0){
                f_four++;
            }else if(randomNum <= 5.0 / 6.0){
                f_five++;
            }else if(randomNum <= 6.0 / 6.0){
                f_six++;
            }
        }
        
        System.out.printf("%5s%12s%12s\n", "Face", "Frequency", "Percentage");
        System.out.println("-----------------------------");
        
        System.out.printf("1:%12d%12d%%\n", f_one, f_one / 10);
        System.out.printf("2:%12d%12d%%\n", f_two, f_two / 10);
        System.out.printf("3:%12d%12d%%\n", f_three, f_three / 10);
        System.out.printf("4:%12d%12d%%\n", f_four, f_four / 10);
        System.out.printf("5:%12d%12d%%\n", f_five, f_five / 10);
        System.out.printf("6:%12d%12d%%\n", f_six, f_six / 10);
        
        int totalFrequency = f_one + f_two + f_three + f_four + f_five + f_six;
        int totalPercentage = totalFrequency / 10;
        
        System.out.println("-----------------------------");
        System.out.printf("Total:%9d%12d%%\n", totalFrequency, totalPercentage);
        
    }
    
}
