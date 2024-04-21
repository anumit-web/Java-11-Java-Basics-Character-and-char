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
        System.out.println("Print array of characters = " + upperCaseLetter);

        // convert string to character
        String s = "h";
        char c = s.charAt(0);// returns 
        System.out.println("convert string to character = " + c);

        // array of characters
        char[] lotr_char_name_2 = new char[8];
        lotr_char_name_2[0] = 'B';
        lotr_char_name_2[1] = 'o';
        lotr_char_name_2[2] = 'r';
        System.out.println(lotr_char_name_2);

        char[] lotr_char_name_3 = {'G','a','l','a','d','r','i','e','l'};
        System.out.println(lotr_char_name_3);

        // check if character is digit or letter
        char char1 = 'a';
        System.out.println("" + Character.isDigit(char1));
        System.out.println("" + Character.isLetter(char1));

        char char2 = '8';
        System.out.println("" + Character.isDigit(char1));
        System.out.println("" + Character.isLetter(char1));    

        // arraylist character
        List<Character> lotr_char_name_4 = new ArrayList<Character>();
        // can also use 
        // ArrayList<Character> lotr_char_name_4 = new ArrayList<Character>();
        lotr_char_name_4.add('G');
        lotr_char_name_4.add('i');
        lotr_char_name_4.add('m');
        lotr_char_name_4.add('l');
        lotr_char_name_4.add('i');
        System.out.println(lotr_char_name_4);

        


        
        
        



    



    }
}