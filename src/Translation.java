

import java.util.Scanner;

public class Translation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Pig Latin Translator!");

        String answer = "";
        //loop to keep translating if the user enters "yes"
        do {
            System.out.print("Enter a word to translate: ");
            String word = scan.next().toLowerCase();

            //translate the word
            String translated = translate (word);
            //output it
            System.out.println(translated);

            System.out.print("Do you want to continue? yes/no ");
            //get the response, turn it lower case
            answer = scan.next().toLowerCase();
        } while (answer.equals("yes"));

        scan.close();
    }

    public static String translate (String word) {
        //find the first vowel
        int vowel = findVowel(word);
        //if it's an invalid word
        if (vowel == -1) {
            System.out.println("Invalid word!");
        }
        //    vowel = 0;

        //if it's at pos. 0
        else if ( vowel == 0) {
            // add "way" to the end
            System.out.println(word + "way");
        }

        //else
        //take the substring from the vowel to the end
        //add the substring from 0 until vowel pos. - 1
        //add "ay"
        else {
            String newWord = word.substring(vowel);
            newWord += word.substring(0,vowel);
            return(newWord + "ay");
        }
        return word;
    }



    public static int findVowel (String word) {

        //for loop i from pos 0 to 4 (or end of word)
        for (int position= 0; position <= word.length()-1 ; position++ ) {
            char letter = word.charAt(position);
            //System.out.print(letter);
            //use charAt() to get the letter
            //if it's 'a' or 'e' or 'i' or 'o' or 'u'
            if (letter == 'a' || letter  == 'i'|| letter  == 'e' || letter == 'o' || letter  == 'u') {
               //System.out.println(position) ;
                return position;
            }

        }
        //if no vowel is found
        return -1;
    }
}