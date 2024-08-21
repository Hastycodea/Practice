import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexRevamped {
    public static void main(String[] args) {

// .	Any character except newline.
// \w	Word character (a-z, A-Z, 0-9, _)
// \W	Not a word character
// \s	Whitespaced character.  Same as to [\t\n\r\f].
// \S	Non-whitespace.
// \d	Any digit. Same as to [0-9].
// \D	Nondigits.


        String regex = "\\D";
        String number = "My very 89 2 0 mother 5 06\nJunior java";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);


        while(matcher.find()) {
            System.out.println("Number found! "+ matcher.group());
        }

        // if (matcher.matches()) {
        //     System.out.println("Killem everyday");
        // } else {
        //     System.out.println("Nobody killed!");
        // }

        
        // if (number.matches(regex)) {
        //     System.out.println("Bang!");
        // } else {
        //     System.out.println("No Bang!");
        // }


    }
}
