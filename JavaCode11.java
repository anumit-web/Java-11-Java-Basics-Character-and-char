/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac JavaCode11.java
/usr/local/Cellar/openjdk/21.0.2/bin/java JavaCode11
*/

// import
import java.util.*;

public class JavaCode11 {

    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------");

        System.out.println("Java Code 11");
        System.out.println("Java - Character and char, char Is a Primitive Type, While String Is a Class");
        System.out.println("");

        // string to char array
        String lotr_char_name = "Gandalf";
        char[] charsFromString = lotr_char_name.toCharArray();
        System.out.println("Print character array = " + Arrays.toString(charsFromString));

        // print character
        char lotr_good_movie = 't';
        System.out.println("Pirnt a charater = " + lotr_good_movie);

        // character comparison
        char letter1 = 'A';
        char letter2 = 'B';
        System.out.println("A < B = " + (letter1 < letter2));

        // character to lower and upper class
        char letter = 'a';
        char upperCaseLetter = Character.toUpperCase(letter);
        System.out.println("character to lower and upper class = " + upperCaseLetter);

        // convert string to character
        String s = "h";
        char c = s.charAt(0);// returns 
        System.out.println("convert string to character = " + c);




    }
}