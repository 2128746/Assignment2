/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class calcAverageScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Please input the number of scores: ");
        int input = console.nextInt();
        System.out.printf("%.2f\n",calcAverageScore(input));
    }
    public static double calcAverageScore(int num){
        Random rand = new Random();
        double sum = 0;
        int counter = 0;
        
        for(int i = 0; i < num; i++){
            int random = rand.nextInt(100);
            System.out.println(random);
            if(random >= 40){
                sum += random;
                counter++;
            }
        }
        return sum / counter;
    }
    
}
