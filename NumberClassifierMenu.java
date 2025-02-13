import java.util.Scanner;

public class NumberClassifierMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char userChoice;

        do { // Menu and logic will go here
            System.out.println("\n=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:   // Code for option 1
                    System.out.print("Enter a number to classify: ");
                    int number = input.nextInt();
                    
                    if (number > 0) { // Use if–else selection to classify the number.
                        System.out.println("The number " + number + " is positive.");
                    } else if (number < 0) {
                        System.out.println("The number " + number + " is negative.");
                    } else {
                        System.out.println("The number is zero.");
                    }

                    if (number % 2 == 0) { // Demonstrate additional boolean expression: check if the number is even.
                        System.out.println("It is also an even number.");
                    } else {
                        System.out.println("It is an odd number.");
                    }
                    break;

                case 2: // Code for option 2
                    System.out.print("Enter a number to display its multiplication table: ");
                    int tableNumber = input.nextInt();
                    System.out.println("Multiplication Table for " + tableNumber + ":");

                    for (int i = 1; i <= 10; i++) { // Use a for loop for table generation.
                        System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
                    }
                    break;

                case 3: // Code for option 3
                    System.out.println("Exiting the program. Goodbye!");
                    input.close();
                    return;  // Exit the loop and program

                default: // Handle invalid choice
                    System.out.println("Invalid option. Please choose between 1 and 3.");
            }

            System.out.print("Do you want to return to the menu? (Y/N): ");
            input.nextLine(); // Consume the newline
            userChoice = input.nextLine().toUpperCase().charAt(0);

        } while (userChoice == 'Y'); // Condition to continue

        System.out.println("Thank you for using the program!");
        input.close();
    }
}
