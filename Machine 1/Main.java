package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // creating scanner to take input
        System.out.println("Enter the number of items: "); //ask user

        int NUM_ITEMS = scanner.nextInt(); // reads character and returns an int
        int items[] = new int[NUM_ITEMS]; // new array are created from inputs
        System.out.println("Enter the value of all items (separated by space): "); //ask user

        // storing into a new array which will be used on printing
        for (int i = 0; i < items.length; i++) { //loop until i is greater than the items length
            items[i] = scanner.nextInt(); // scan the next input and returns int
        }

        System.out.println("The Values are: {");
        for (int i= 0; i < NUM_ITEMS ; i++) { //loop until the numbers are printed
            if (i == NUM_ITEMS - 1){
                System.out.print(items[i] + "]");
            }
            else {
                System.out.print(items[i]+ ", ");
            }
        }
    }
}