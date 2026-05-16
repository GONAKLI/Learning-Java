import java.util.Scanner;
//not completed
class deleteElements {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtilityScanner.getInput();
        System.out.println("here we delete a specific array element ");
        showArr(arr);
        System.out.print("\n\nnow, enter a number which you want to delete: ");
        int number = input.nextInt();
        arr = deleteElementFromArray(arr, number);
       // showArr(arr);
    }

    static void showArr(int[] arr){
        int i =0;
        while (i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }


    static int[] deleteElementFromArray(int[] arr, int number){

        int i =0;
        while( i< arr.length){
            if(number == arr[i]){
                int j = i;
                while(j < arr.length ){
                    if(j == arr.length-1){
                        arr[j] = 143;
                       break;
                    }
                    arr[j] = arr[j +1];
                    j++;
                }
                showArr(arr);
                return arr;
            }
            i++;
        }
        return arr;

    }

}
