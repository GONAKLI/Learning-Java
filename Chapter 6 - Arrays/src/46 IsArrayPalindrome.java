class IsArrayPalindrome {
    static void main() {
        int[] arr = ArrayUtilityScanner.getInput();
        boolean isPalindrome = isPalindrome(arr);
        if(isPalindrome){
            System.out.println("yes, given array is a palindrome ");
        }else{
            System.out.println("!oops, its not a palindrome ");
        }
    }

    static boolean isPalindrome(int[] arr){
        int j = arr.length - 1;
        int[] newArr = new int[arr.length];
        int i =0;
        while(j >=0){
            newArr[i] = arr[j];
            j--;
            i++;

        }
    boolean result = compareArrays(arr, newArr);
        return result;
    }
    static void displayArray(int[] arr){
        int i =0;
        while(i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }
    static boolean compareArrays(int[]arr, int[]newArr){
        int i = 0;
        while(i< arr.length){
            if(arr[i] != newArr[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
