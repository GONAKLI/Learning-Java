import java.util.Scanner;

class SumAndAverage {
    static void main() {
        // here we do sum and average of all elements in an array

        int[] myArr = ArrayUtilityScanner.getInput();

        int sum = sum(myArr);
        double average = average(myArr);

        System.out.println("Sum of all Elements in Given array is: " + sum);
        System.out.println("Average of given Array is: " + average);
    }


    static int sum(int[] arr){
        int i =0;
        int sum = 0;
        while (i < arr.length){
            sum += arr[i];
            i++;
        }

        return sum;
    }

    static double average(int[] arr){
        int arrayLength = arr.length;
        int sum = sum(arr);
        double average = (double) sum / arrayLength;
       return average;
    }
}
