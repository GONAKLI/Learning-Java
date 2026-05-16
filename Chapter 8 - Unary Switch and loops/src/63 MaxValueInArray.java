import java.util.Scanner;

class MaxValueInArray {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to max finder in array");
        System.out.print("Now, enter number of elements: ");
        int totalEle = input.nextInt();
        int[] array = new int[totalEle];
        array = inputElement(array, totalEle);

        int maxNumber = checkMax(array);
        System.out.println("maxium number in array is: " + maxNumber);
    }

    public static int checkMax(int[] array){
       int maxNumber = 0;
        for( int num: array){
            if(num > maxNumber){
                maxNumber = num;
            }
        }
        return maxNumber;
    }


    public static int[] inputElement(int[] array, int number){
        Scanner input = new Scanner(System.in);
        for(int i=0; i < number; i++){
            System.out.print("enter element number " + (i+1) + " : ");
            array[i] = input.nextInt();
        }
        return array;
    }
}
