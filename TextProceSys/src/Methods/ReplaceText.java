package Methods;

public class ReplaceText
{
    //Method for replacing text
    public static String replaceText(String text, String oldText, String newText)
    {
        //Check if text is entered
        if(!isValidText(text))
        {
            System.out.println("Please enter a valid text");
            return text;
        }
        //Check if new text is entered
        if(!isValidText(newText))
        {
            System.out.println("Please enter a valid text to replace");
            return newText;
        }
        //Check if old text is null
        if(oldText == null)
        {
            System.out.println("Old text cannot be empty!");
            return text;
        }

        //Replace the text
        return text.replaceAll(java.util.regex.Pattern.quote(oldText), newText);
    }
    //Method for validating the texts
    private static boolean isValidText(String text)
    {
        return text != null && !text.trim().isEmpty();
    }
}
