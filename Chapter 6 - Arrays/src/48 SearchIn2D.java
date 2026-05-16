import java.util.Scanner;

class SearchIn2D {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[][] array1 = ArrayUtilityScanner.getInput2DArray();

        System.out.println("enter a number to search in an array");
        int number = input.nextInt();
        boolean result = search(array1, number);
        if(result){
            System.out.println(" Yay, number found in this array");
        }else {
            System.out.println("number not found !!");
        }
    }
    static boolean search(int[][]arr, int number){
        int i =0;
        while(i < arr.length){
            int p=0;
            while (p< arr[i].length){
                if(number == arr[i][p]){
                    return true;
                }
                p++;
            }
            i++;
        }
        return false;
    }
}
