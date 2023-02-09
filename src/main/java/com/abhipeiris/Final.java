package com.abhipeiris;

import java.util.Arrays;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 05/02/2023
 * Time: 12:53 am
 */
public class Final {
    public static void main(String[] args)
    {
        
//        int a[] = new int[] {2, 1, -4, -1, -10, -8, 4, -8, -8, 5};
        int a[] = new int[] {10, 8, -7, 9, 10, 10, 4, -7, -7, 3};
//        int a[] = new int[] {-10, 2, 100000};
//        int a[] = new int[] {1, 3};


        int[] ints = greennessOnTheOtherSide(a);
        System.out.println("Output -- " + Arrays.toString(ints));
    }


    public static int[] greennessOnTheOtherSide(int[] greenness) {
        int n = greenness.length;
        int[] sortedGreenness = greenness.clone();
        Arrays.sort(sortedGreenness);
        int[] result = new int[n];

        System.out.println("unsorted -- " + Arrays.toString(greenness));
        System.out.println("sorted -- " + Arrays.toString(sortedGreenness));

//        for (int i = 0; i < n; i++) {
//            int index = indexOf(greenness, sortedGreenness[i]);
//            int left = (i + 1 < n) ? sortedGreenness[i + 1] : 0;
//            int right = (i + 2 < n) ? sortedGreenness[i + 2] : 0;
//            result[index] = Math.max(left, right);
//        }
        int index = indexOf(greenness, sortedGreenness[sortedGreenness.length-1]);
        System.out.println("ïndex -- " + index);

        int x = 0;
        for (int count = index; count > 0; count--){
            System.out.println(greenness[index]);
            x++;

        }
        if(x < n){
            for (int count = x; count < n; count ++) {
                System.out.println(sortedGreenness[sortedGreenness.length - 2]);
            }
        }

        return result;
    }

    private static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
