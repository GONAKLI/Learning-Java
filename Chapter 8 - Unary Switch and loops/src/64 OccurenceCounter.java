import java.util.Scanner;

class OccurenceCounter {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Occurence finder in array ");
        System.out.print("enter number of element in array ");
        int totalElements = input.nextInt();
        int [] numArray = new int[totalElements];
        numArray = inputArrayEle(numArray, totalElements);
        System.out.print("\n Which number occurence you want to find: ");
        int number = input.nextInt();
        int totalOccurence = findTotalOccurence(numArray, number);
        System.out.println("total occurence of this number is: " + totalOccurence);
    }

    public static int findTotalOccurence(int[] numArray, int number){
        int total = 0;
        for(int nums: numArray){
            if(nums == number){
                total++;
            }
        }
        return total;
    }

    public static int[] inputArrayEle(int [] numArray, int totalEle){
        Scanner input = new Scanner(System.in);
        for(int i =0; i < totalEle; i++){
            System.out.print("Enter element number " + (i+1) + " : ");
            numArray[i] = input.nextInt();
        }
        return numArray;
    }
}
