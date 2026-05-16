import java.util.Scanner;

public class ArrayUtilityScanner {
    public static int[] getInput(){
        Scanner input = new Scanner(System.in);

        System.out.print("enter the Size of array: ");
        int size = input.nextInt();
        int[] numArray = new int[size];
        int i = 0;
        while(i<size){
            System.out.print("enter element no. " + (i+1) + "  :  ");
            numArray[i] = input.nextInt();
            i++;
        }
        System.out.println("Thanks for Entering elements");
        return numArray;
    }

    public static int[][] getInput2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter no. of rows: ");
        int rows = input.nextInt();
        System.out.print("enter no. of columns: ");
        int columns = input.nextInt();

        int[][] newArray = new int[rows][columns];

        int i =0;
        while ( i < rows){
            int j = 0;
            while(j < columns){
                System.out.print("Enter element for " + (i+1) +" row and " + (j+1) + " column: ");
                newArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        System.out.println("... Thanks for entering Elements ...");
        return newArray;

    }
}
