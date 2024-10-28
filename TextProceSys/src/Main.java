import Methods.CountWords;
import Methods.FindPatterns;
import Methods.ReplaceText;
import Methods.ValidateEmail;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input text at the start of the program
        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        //Loop the switch
        boolean exit = false;
        while (!exit) {
            System.out.println("\nCurrent Text: " + text);
            System.out.println("\nChoose an operation:");
            System.out.println("1. Count Words");
            System.out.println("2. Find Pattern");
            System.out.println("3. Replace Text");
            System.out.println("4. Validate Email");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    //Count words
                    CountWords countWords = new CountWords();
                    System.out.println(countWords.countWords("Word counter"));
                    int wordCount = countWords.countWords(text);
                    System.out.println("Counted words: " + wordCount);
                    break;

                case 2:
                    //Find pattern
                    FindPatterns fp = new FindPatterns();
                    System.out.println("Enter the pattern: ");
                    String pattern = scanner.nextLine();
                    int patternCount = fp.findPatternCount(pattern);
                    System.out.println("This pattern has been '" + pattern + "' found " + patternCount + " times.");
                    break;

                case 3:
                    //Replace text
                    System.out.println("Enter the replacement text:");
                    String newText = scanner.nextLine();
                    text = ReplaceText.replaceText(text, text, newText);
                    System.out.println("Updated Text: " + text);
                    break;

                case 4:
                    //Validate email
                    System.out.println("Enter the email:");
                    String emailInput = scanner.nextLine();
                    boolean isValid = ValidateEmail.validateEmail(emailInput);
                    System.out.println("Is the email valid? " + isValid);
                    break;

                case 5:
                    //Set exit variable to true inorder to exit the switch and end the program
                    exit = true;
                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 5.");
                    break;
            }
        }

        scanner.close();
    }
}
