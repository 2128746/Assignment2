/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author admin
 */
public class calcFutureSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(calcFutureSalary(1000, 12));
    }
    
    public static double calcFutureSalary(double currentSalary, int year){
        double salary = 0;
        for(int i = 0; i < year; i++){
            if(i < 3){
              salary += currentSalary * 0.03;  
            }else if(i >= 3 && i < 10){
                salary += currentSalary * 0.05;
            }else if(i >= 10){
                salary += currentSalary * 0.08;
            }
        }
        return salary + currentSalary;
    }
    
}
