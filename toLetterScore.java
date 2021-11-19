/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class toLetterScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a digit score: ");
        double digitScore = console.nextDouble();
        
        System.out.printf("%s: %c, ", "Your score as a letter is", toLetterScore(digitScore));
        printMessage1(toLetterScore(digitScore)); //this method is using if else
        //printMessage2(toLetterScore(digitScore)); this method is using case switch
    }
    
    public static char toLetterScore(double digitScore){
        char letterScore = 'a';
        
        if(digitScore >= 90 && digitScore <= 100){
            letterScore = 'A';
        }else if(digitScore >= 80 && digitScore < 90){
            letterScore = 'B';
        }else if(digitScore >= 70 && digitScore < 80){
            letterScore = 'C';
        }else if(digitScore >= 60 && digitScore < 70){
            letterScore = 'D';
        }else if(digitScore >= 0 && digitScore < 60){
            letterScore = 'F';
        }
        return letterScore;
    }
    
    public static void printMessage1(char letterScore){//this method is using if else
        if(letterScore == 'A'){
            System.out.print("Excellent\n");
        }else if(letterScore == 'B'){
            System.out.print("Well done\n");
        }else if(letterScore == 'C'){
            System.out.print("Well done\n");
        }else if(letterScore == 'D'){
            System.out.print("Passed\n");
        }else if(letterScore == 'F'){
            System.out.print("Failed\n");
        }
    }
    
    public static void printMessage2(char letterScore){//this method is using case switch
        switch (letterScore) {
            case 'A':
                System.out.print("Excellent\n");
                break;
            case 'B':
                System.out.print("Well done\n");
                break;
            case 'C':
                System.out.print("Well done\n");
                break;
            case 'D':
                System.out.print("Passed\n");
                break;
            case 'F':
                System.out.print("Failed\n");
                break;
            default:
                break;
        }
    }
}
