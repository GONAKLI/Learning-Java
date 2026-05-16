class reverseArray {
    static void main() {
        int[] arr =ArrayUtilityScanner.getInput();
        System.out.println("array looks before reversing: ");
        printArray(arr);
        arr = reverse(arr);
        System.out.println("\n\nafter reversed, new array is: ");
        printArray(arr);
    }
    static void printArray(int[] arr ){
        int i = 0;
        while (i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    static int[] reverse(int[] arr ){
        int i = arr.length  - 1;
        int j =0;
        int[] newArr = new int[arr.length];
        while(i>=0){
            newArr[j] = arr[i];
            i--;
            j++;
        }
        return  newArr;
    }
}
