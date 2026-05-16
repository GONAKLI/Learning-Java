class SumOfDiagonalElements {
    static void main() {
        int[][] numArray = ArrayUtilityScanner.getInput2DArray();
        long sum = findDiagonalSum(numArray);
        System.out.println("Sum of Diagonal is: " + sum);
    }

    static long findDiagonalSum(int[][] numArray){
        long sum = 0;
        int length = numArray.length;
        int i =0;
        while (i < numArray.length){
            sum += numArray[i][i];
            i++;
        }
        i = i - 1;
        if(length % 2 == 0){
            int j = 0;
            while(i >= 0){
                sum += numArray[i--][j++];

            }
        }else{
            int j = 0;
            while(i >= 0){
                if (j == length / 2){
                    j++;
                    i--;
                }else{
                    sum += numArray[i--][j++];
                }


            }
        }

        return sum;
    }
}
