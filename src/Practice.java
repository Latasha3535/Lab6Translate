import java.util.Scanner;

/**
 * Created by peter on 2/7/17.
 */
public class Practice {
    public static void main (String[] args) {
        //output a count from 1 to 1000
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }

        //output a count from 200 to 0 by fours (200 196 192... 0)
        for (int i = 200; i >= 0; i -= 4) {
            System.out.println(i);
        }

        //take an int from the user
        //keep prompting them for an int until it's between 1 and 10
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer between 1 and 10: ");
        int number = scan.nextInt();

        while (number < 1 || number > 10) {
            System.out.println(("Incorrect input!"));
            System.out.print("Please enter an integer between 1 and 10: ");
            number = scan.nextInt();
        }

        System.out.println("Thank you; your number is " + number);

        String sentence = "Hello world";
        //output the contents of sentence until the first space
        //find a space
        int firstSpace = sentence.indexOf(' ');
        //get the substring up until the first space
        //  note: this will not include the space in substring
        String firstWord = sentence.substring(0, firstSpace);
        //output
        System.out.println(firstWord);

        //System.out.println(sentence.substring(0, sentence.indexOf(' ')));
        String w = firstWord("this works with any sentence");
        System.out.println(w);

        w = lastWord("this works with any sentence");
        System.out.println(w);

    }

    //write a method that takes a String argument and returns the first word
    //call the method firstWord
    public static String firstWord(String s) {
        //find a space
        int firstSpace = s.indexOf(' ');
        //get the substring up until the first space
        //  note: this will not include the space in substring
        String firstWord = s.substring(0, firstSpace);
        //output
        return firstWord;
    }

    //write a method that takes a String argument and returns the last word
    //call the method lastWord
    public static String lastWord(String s) {
        //find last space
        int lastSpace = s.lastIndexOf(' ');
        //get the substring up until the first space
        //  note: +1 to not include the space in substring
        String lastWord = s.substring(lastSpace + 1);
        //output
        return lastWord;
    }
}


