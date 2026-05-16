import java.util.Scanner;

class PalindromeCheckUsingRecurrsion {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to string palindrome");
        System.out.print("enter a word to check it: ");
        String word = input.next();
     //  System.out.println(word.substring(1, word.length() -1));
        boolean result = palind(word);
        if(result){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("Oops, string is not palindrome");
        }


    }

    static boolean palind(String word){
      if(word.length() <=1){
          return true;
      }
      if(word.charAt(0) != word.charAt(word.length()-1)) {
          return false;
      }
      return palind(word.substring(1,word.length()-1));
    }
}
