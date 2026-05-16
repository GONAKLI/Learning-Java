class IsSorted {
    static void main() {
        int[] arr = ArrayUtilityScanner.getInput();
        boolean asc = asc(arr);
         boolean desc = desc(arr);
         if(asc || desc){
             if(asc){

                 System.out.println("array is sorted in ascending order ");
             }
             if (desc) {
                 System.out.println("array is sorted in descending order ");
             }
         }else{
             System.out.println("array is not sorted");
         }
    }

    static boolean desc(int[] arr){
        int i =0;
        int element = arr[0];
        while( i< arr.length){
            if(element >= arr[i]){
                element = arr[i];
            }else {
                return false;
            }
            i++;
        }
        return true;
    }

    static boolean asc(int[] arr){
        int i = 0;
        int element = arr[0];
        while(i < arr.length){
            if(element <= arr[i]){
                element = arr[i];
            }else{
                return false;
            }
            i++;
        }
        return true;
    }
}
