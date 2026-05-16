import java.util.Scanner;

class occurenceFinder {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtilityScanner.getInput();
        System.out.println("enter a number to find occurence: ");
        int number = input.nextInt();
        int repetion = findRepeat(arr, number);
        System.out.println("number repeatd in this array is: " + repetion);
    }

    static int findRepeat(int[] arr, int num){
        int i=0;
        int repeat =0;
        while(i < arr.length){
            if(arr[i] == num){
                repeat++;
            }
            i++;
        }
        return  repeat;
    }
}
