import java.util.Scanner;

/**
 * Recursive factorial program asks the user to input
 * a positive integer and then uses a recursive function
 * to display the factorial of the inputted integer.
 *
 * @author Ketia Gaelle Kaze
 * @version 1.0
 * @since 2022-03-31
 */

class RecursiveFactorial {
    /**
    * Creating an empty public constructor.
    *
    */
    public RecursiveFactorial() { }

    /**
    * Display the factorial to the console.
    *
    * @param num passed in
    * return factorial
    */

    public static int fact(int num) {
        int factorial;

        if (num == 1 || num == 0) {
            factorial = (int) 1;
        } else {
            factorial = (int) fact(num - 1) * (int) num;
        }
        return factorial;
    }

    /**
    * Main entry to the program.
    *
    * @param args nothing passed in
    *
    *
    */

    public static void main(String[]args) {
        // declaring variables
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        int userInputInt;
        int userFactorial;

        // get user input
        System.out.print("Please enter a positive integer: ");
        userInput = sc.nextLine();

        try {
            userInputInt = Integer.parseInt(userInput);

            if (userInputInt >= 0) {
                userFactorial = fact(userInputInt);

                System.out.println("The factorial of "
                        + userInputInt + "! is " + userFactorial);

            } else {
                System.out.println("Please enter a positive integer.");
            }
        } catch (IllegalArgumentException exception) {
            System.out.println("Please enter a valid integer.");
        }
    }
}
