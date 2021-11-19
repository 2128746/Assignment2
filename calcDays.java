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
public class calcDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a month's number: ");
        int monthInput = console.nextInt();
        System.out.print("Please enter a year: ");
        int yearInput = console.nextInt();
        System.out.printf("%-9s %s %d\n","(Else)","The number of days in this month is:", calcDays1(monthInput, yearInput));
        System.out.printf("%-9s %s %d\n","(Switch)","The number of days in this month is:", calcDays2(monthInput, yearInput));
        
    }
    public static int calcDays1(int month, int year){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }else if(month == 2){
            if(isLeapYear(year) == true){
                return 29;
            }else{
                return 28;
            }
        }
        return 0;
    }
    public static boolean isLeapYear(int year){
        if(year % 4 != 0){
            return false;
        }else if(year % 100 != 0){
            return true;
        }else if(year % 400 != 0){
            return false;
        }else{
            return true;
        }
    }
    public static int calcDays2(int month, int year){
        switch (month) {
            case 1:
                {
                    return 31;
                }
            case 3:
                {
                    return 31;
                }
            case 5:
                {
                    return 31;
                }
            case 7:
                {
                    return 31;
                }
            case 8:
                {
                    return 31;
                }
            case 10:
                {
                    return 31;
                }
            case 12:
                {
                    return 31;
                }
            case 4:
                {
                    return 30;
                }
            case 6:
                {
                    return 30;
                }
            case 9:
                {
                    return 30;
                }
            case 11:
                {
                    return 30;
                }
            case 2:
                if(isLeapYear(year) == true){
                    return 29;
                }else{
                    return 28;
                }
        }
        return 0;
    }
}
