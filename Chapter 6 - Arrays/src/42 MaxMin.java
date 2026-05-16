import java.util.Scanner;

class MaxMin {
    static void main() {
        Scanner input = new Scanner(System.in);

        int[] arr = ArrayUtilityScanner.getInput();
        int max = maxFinder(arr);
        int min = minFinder(arr);

        System.out.println("biggest number in this array is: " + max);
        System.out.println("Smallest number in this array is: " + min);

    }

    static int minFinder(int[] arr){
        int i =0;
        int minimum = arr[i];
        while(i < arr.length){
            if(minimum > arr[i]){
                minimum = arr[i];
            }
            i++;

        }
        return minimum;
    }

    static int maxFinder(int[] arr){
        int i =0;
        int maxNumber = 0;
        while (i< arr.length){
            if(maxNumber < arr[i]){
                maxNumber = arr[i];
            }
            i++;
        }
        return maxNumber;
    }
}
