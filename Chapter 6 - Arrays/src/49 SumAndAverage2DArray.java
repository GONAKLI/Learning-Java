class SumAndAverage2DArray {
    static void main() {
        int[][] array = ArrayUtilityScanner.getInput2DArray();

        int sum = findSum(array);
        double average = findAvereage(array);

        System.out.println("sum of all Elements in this array is: " + sum);
        System.out.println("average of all elements in this array is: " + average  );
    }

    static int findSum(int[][] array){
        int sum =0;
        int i =0;
        while ( i< array.length){
            int j=0;
            while(j< array[i].length){
                sum += array[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    static double findAvereage(int[][] array){
        int sum = findSum(array);
        int noOfElements = 0;
        int i =0;
        while(i< array.length){
            int j = 0;
            while (j<array[i].length){
                noOfElements++;
                j++;
            }
            i++;
        }
        return (double) sum/noOfElements;
    }
}
