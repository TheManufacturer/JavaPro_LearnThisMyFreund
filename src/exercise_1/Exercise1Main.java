package exercise_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1Main {

    public static boolean isNumberInRange(int number, int min, int max){
        if (number >= min && number <= max) {
            return true;
        }
        else {
            throw new IllegalArgumentException("Number -> "+ number + " not in range ( "
                    + min + " to " + max  + ")");
        }
    }

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
