import java.util.Scanner;

class deleteElements2ndApproach {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtilityScanner.getInput();
        System.out.println("here we delete a specific array element ");
        showArr(arr);
        System.out.print("\nnow, enter a number which you want to delete: ");
        int number = input.nextInt();
        arr = deleteElementFromArray(arr, number);
        showArr(arr);
    }

    static void showArr(int[] arr){
        int i =0;
        while (i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }


    static int[] deleteElementFromArray(int[] arr, int number){
        int p =0;
        int occ = 0;
        while(p< arr.length){
            if(arr[p] == number){
                occ++;
            }
            p++;
        }

        int j=0;
        int[] newArray = new int[arr.length - occ];
        int i =0;
        while (i< arr.length){
            if(number != arr[i]){
                newArray[j] = arr[i];
                j++;
            }
          i++;
        }
        return newArray;
    }

}
