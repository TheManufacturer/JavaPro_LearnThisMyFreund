package exercise_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1Main {


    /**
     * #isNumberInRange methods :
     * Checks if a number is within a specified range.
     *
     * @param number The number to check.
     * @param min The minimum value of the range.
     * @param max The maximum value of the range.
     * @return true if the number is within the range, false otherwise.
     * @throws IllegalArgumentException if the number is not within the range.
     *
     */
    public static boolean isNumberInRange(int number, int min, int max){
        if (number >= min && number <= max) {
            return true;
        }
        else {
            throw new IllegalArgumentException("Number -> "+ number + " not in range ( "
                    + min + " to " + max  + ")");
        }
    }

    /**
     * Entry point of the program. Reads input numbers from the user
     * and checks if a given number is within a specified range.
     *
     * Uses a try-with-resources block to manage a Scanner object for input.
     * Handles InputMismatchException when user input is not an integer.
     * Handles IllegalArgumentException when the number is not within the specified range.
     *
     * @param args Command-line arguments (not used in this program).
     */

    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insert number to check");
            int number = scanner.nextInt();
            System.out.println("You inserted number : " + number);

            System.out.println("Insert minimum value for range: ");
            int max = scanner.nextInt();

            System.out.println("Insert maximum value for range: ");
            int min = scanner.nextInt();

            boolean check = isNumberInRange(number, min, max);
            System.out.println("Number : " + number + " Is in range : " + check);

        } catch (InputMismatchException e) {
            System.out.println("Error : Not a integer number ...");

        } catch (IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());

        }
    }
}

// Exercise using "Try & Catch" to handle errors

// Define a method to check if a number is an integer within a specified range
// If the number is not within the range, handle the error appropriately
