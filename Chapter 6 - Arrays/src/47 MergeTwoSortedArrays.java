import java.util.Arrays;

class MergeTwoSortedArray{
    static void main() {
        int[] arr =ArrayUtilityScanner.getInput();

        System.out.println("Now, enter 2nd Array elements \n");
        int[] secondArr = ArrayUtilityScanner.getInput();
       int[] mergedArray = mergeArrays(arr, secondArr);
       displayArray(mergedArray);


    }
    static int[] mergeArrays(int[] arr1, int[] arr2){
        int totalLength = arr1.length + arr2.length;
        int [] newArray = new int[totalLength];
        int i = 0, j=0, n=0, loopIteration = 0 ;
        while ( i < arr1.length && j < arr2.length){

           if(arr1[i] <= arr2[j]){
               newArray[n++] = arr1[i++];

           }else{
               newArray[n++] = arr2[j++];
           }
        }
        while (i < arr1.length){
            newArray[n++] = arr1[i++];
        }
        while ( j < arr2.length){
            newArray[n++] = arr2[j++];
        }
        return newArray;
    }
    static void displayArray(int[] arr){
        int i =0;
        while(i< arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}