import java.util.Scanner;

class ArrayOfWords {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to 'String Builder' Operations ");
        System.out.print("enter number of words you want to enter: ");
        int count = input.nextInt();
        StringBuilder sentence = new StringBuilder();
        int i=0;
        while(i<count){
            System.out.printf("enter word number %d: ", i+1);
            sentence.append(input.next() + " ");
            i++;
        }
        System.out.println("you have entered: " + sentence);
    }
}
