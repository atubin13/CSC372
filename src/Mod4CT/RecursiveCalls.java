package Mod4CT;

public class RecursiveCalls {
    public static void backwardsAlphabet(char currLetter) {
        if (currLetter == 'a') {
            System.out.println(currLetter);
        }
        else {
            System.out.print(currLetter + " ");
            backwardsAlphabet((char)(currLetter - 1));
        }
    }

    public static void main (String [] args) {
        char startingLetter;

        startingLetter = 'z';

        backwardsAlphabet(startingLetter);

    }
}