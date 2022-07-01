package package1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0; //declaring the sum (initially 0)
        int min = 0; //declaring the minimum
        int max = 100; //declaring the maximum

        Scanner number = new Scanner(System.in); //create new scanner object
        System.out.print("Enter the number of students: "); //ask user
        int  numStudents = number.nextInt(); //take the next inputs as int
        int grades[] = new int[numStudents]; //store inputs into array

        //loop for inputting the student's scores
        for(int i = 0; i < numStudents; i++) { //keep looping until the i is greater than numStudents
            int x = i + 1; //create variable to display student number
            System.out.print("Enter the grade for student " + x + " : "); //ask user
            grades[i] = number.nextInt(); //take the next inputs as int
            sum += grades[i]; //create the total of the grade

            //check for minimum grade
            if(grades[i] > min) { //if grade is greater than min
                min = grades[i]; //set that value as min
            }

            //check for maximum grade
            if(grades[i] < max) { //if grade is lower than max
                max = grades[i]; //set that value as max
            }
        }

        //calculate the average
        double gradeAverage = sum / numStudents;

        //print the results
        System.out.print("The average is: " + gradeAverage);
        System.out.println();
        System.out.print("The minimum is: " + max);
        System.out.println();
        System.out.print("The maximum is: " + min);
    }
}
