import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import static java.lang.Double.parseDouble;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution12
 *  Copyright 2021 Sean Moore
 */

public class Solution12 {
    public static void main(String[] args){
        /*
        -Create an application which asks for and takes a principal investment,
        the rate per year of interest, and the number of years invested as input
        -Then accrued amount is computed and output to user
        -Again use BigDecimal for rounding up to the next penny
         */
        
        //  Use a scanner to take the principal, rate of interest, and number of years of interest accumulation
        Scanner input = new Scanner(System.in);
        double amount, principal, rate, time;
        
        //  Take in ptincipal, rate, and time
        System.out.printf("Enter the principal: ");
        principal = parseDouble(input.nextLine());
        System.out.printf("Enter the rate of interest: ");
        rate = parseDouble(input.nextLine());
        System.out.printf("Enter the number of years: ");
        time = parseDouble(input.nextLine());
        
        //  Calculate the new amount from the interest rate
        amount = principal + principal * rate * time/100;
        BigDecimal money = new BigDecimal(amount);
        
        //  Use bigdecimal rounding to round up to the nearest cent
        money = money.setScale(2, RoundingMode.CEILING);
        System.out.println("After "+String.format("%.0f",time)+" years at "+String.format("%.1f",rate)+
                           "%, with the investment will be worth $"+money+".");
    }
}
