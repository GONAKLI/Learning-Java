package set_95;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharacter {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to unique word counter");
        System.out.print("enter your name: ");
        String userName = input.next();
        int totalChar = findUniqueCharacters(userName);
        System.out.println("total no of unique characters are: " + totalChar);
    }
    static int findUniqueCharacters(String word){
        HashSet<Character> alphabet = new HashSet<>();
        for(int i=0; i < word.length(); i++){
            alphabet.add(word.charAt(i));
        }
        return alphabet.size();


    }
}
