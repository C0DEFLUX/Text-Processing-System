package Methods;
import java.util.Scanner;

public class CountWords
{
    public int countWords(String text)
    {
        //splits the text into words
        String[] countWords = text.split(" ");

        //returns the word number of words in array
        return countWords.length;
    }
}
