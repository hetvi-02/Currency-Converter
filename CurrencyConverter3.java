import java.util.Scanner;

/**
 * CurrencyConverter
 */
public class CurrencyConverter3 {

    public static void main(String[] args) {
        boolean continueConversion = true;
        Scanner sc = new Scanner(System.in); // Move the Scanner object outside the loop

        while (continueConversion) {
            // Display menu
            System.out.println("1. Rupee");
            System.out.println("2. Dollar");
            System.out.println("3. Euro");
            System.out.println("4. Exit");
            System.out.print("Choose the currency: ");
            
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting the program.");
                continueConversion = false; // Exit the loop if user chooses '4'
                break;
            }

            System.out.print("Enter the amount: ");
            double amount = sc.nextDouble();

            // Convert the amount
            switch (choice) {
                case 1:
                    Rupee_to_other(amount);
                    break;
                case 2:
                    Dollar_to_other(amount);
                    break;
                case 3:
                    Euro_to_other(amount);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        System.out.println("End of the program.");
        sc.close(); // Close the scanner at the end of the program
    }

    public static void Rupee_to_other(double amt) {
        System.out.println("1 Rupee = " + 0.013 + " Dollar");
        System.out.println(amt + " Rupee = " + (amt * 0.013) + " Dollar");

        System.out.println("1 Rupee = " + 0.012 + " Euro");
        System.out.println(amt + " Rupee = " + (amt * 0.012) + " Euro");
        System.out.println();
    }

    public static void Dollar_to_other(double amt) {
        System.out.println("1 Dollar = " + 79.37 + " Rupee");
        System.out.println(amt + " Dollar = " + (amt * 79.37) + " Rupee");

        System.out.println("1 Dollar = " + 0.98 + " Euro");
        System.out.println(amt + " Dollar = " + (amt * 0.98) + " Euro");
        System.out.println();
    }

    public static void Euro_to_other(double amt) {
        System.out.println("1 Euro = " + 80.85 + " Rupee");
        System.out.println(amt + " Euro = " + (amt * 80.85) + " Rupee");

        System.out.println("1 Euro = " + 1.02 + " Dollar");
        System.out.println(amt + " Euro = " + (amt * 1.02) + " Dollar");
        System.out.println();
    }
}
