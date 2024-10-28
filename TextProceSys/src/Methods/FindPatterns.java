package Methods;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class FindPatterns {
    public int findPatternCount(String text, String pattern)
    {
        //compiles pattern into a object
        Pattern p = Pattern.compile(pattern);

        //counts the number of found patterns
        int count = 0;

        //matcher object finds patterns
        Matcher m = p.matcher(text);

        //counts all matches
        while(m.find()){
            count++;
        }

        //returns of found matches
        return count;
    }
}


