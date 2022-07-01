package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //creating input scanner object
        System.out.print("Enter the number of the items: "); //ask user

        int NUM_ITEMS = input.nextInt(); //reads character and returns an int
        int [] items = new int[NUM_ITEMS]; //new array are created from inputs
        System.out.println("Enter the value of all items (separated by space): "); //ask user

        for(int i = 0; i < items.length; i++){ //loop until all values are stored
            items[i] = input.nextInt();
        }
        for(int i = 0; i < items.length; i++){ //loop until each value is printed
            System.out.print(i + ": ");
            for(int j = 0; j < items[i]; j++){
                System.out.print('*');
            }
            System.out.println("("+ items[i] + ")");
        }
    }
}