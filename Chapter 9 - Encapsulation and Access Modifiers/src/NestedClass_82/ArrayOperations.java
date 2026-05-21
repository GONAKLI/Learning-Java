package NestedClass_82;

import java.util.Arrays;

public class ArrayOperations {
    public static class Statistics{
        public double mean (int[] array){
            int sum =0;
            int count = 0;
            for(int num : array){
                sum += num;
                count++;
            }
            return (double) sum/count;
        }
        public double median(int[] array){
            Arrays.sort(array);
            if(array.length %2 != 0){
                return array[array.length/2];
            }
            else {
                int midEvent = array.length/2;
                double sum = array[midEvent] + array[midEvent-1];
                return sum /2;
            }
        }

    }

}
