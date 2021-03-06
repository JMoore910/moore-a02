import java.util.Scanner;
import static java.lang.Integer.parseInt;

/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution10
 *   Copyright 2021 Sean Moore
 */

public class Solution10 {
    public static void main(String[] args){
        /*
         -Create an application that prompts for the price and quantity
         of three items in a checkout cart
         -application receives input values from user for 3 items
         -The subtotal is then calculated by summing all prices
         -Tax is applied as %5.5 of subtotal
         -New Total after tax is then output
         -Input - Processing - Output need to be tackled individually
         on separate lines
         -As per usual use parseInt to convert input strings to integers
         */

        //  Use a scanner to take in the price and quantity of three separate items
        Scanner input = new Scanner(System.in);
        int [] quan = new int[3];
        int [] price = new int[3];
        double subTotal = 0,tax = 0.055,cartTax,newTot;
        
        //  use a for loop to take in three different prices and quantities
        for (int i = 0;i<3;i++){
            System.out.printf("Enter price of item "+(i+1)+": ");
            price[i] = parseInt(input.nextLine());
            System.out.printf("Enter quantity of item "+(i+1)+": ");
            quan[i] = parseInt(input.nextLine());
        }
        
        //  use another for loop to calculate the subtotal as a summation of each item price * quantity
        for (int i = 0;i<3;i++){
            subTotal += (price[i]*quan[i]);
        }
        
        //  Calculate the current tax of the user's cart as well as the new total with the tax included
        cartTax = subTotal * tax;
        newTot = subTotal + cartTax;
        
        //  Output the subtotal, tax, and total
        System.out.println("Subtotal: $" + String.format("%.2f",subTotal));
        System.out.println("Tax: $" + String.format("%.2f",cartTax));
        System.out.println("Total: $" + String.format("%.2f",newTot));
    }
}
