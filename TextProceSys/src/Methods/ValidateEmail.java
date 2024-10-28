package Methods;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ValidateEmail {
    // Regex pattern for a valid email address
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    public static boolean validateEmail(String text)
    {
        //Check if email is empty
        if (!isValidText(text))
        {
            System.out.println("Email cannot be null or empty.");
            return false;
        }
        //Return the boolean value of the email check
        return isValidEmail(text);
    }

    //Validate email format method
    private static boolean isValidEmail(String email)
    {
        return email.matches(EMAIL_REGEX);
    }

    //Check for empty text method
    private static boolean isValidText(String text)
    {
        return text != null && !text.trim().isEmpty();
    }
}

