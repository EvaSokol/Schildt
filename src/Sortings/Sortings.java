package Sortings;

import java.util.Arrays;

/**
 * Created by Eva Sokolyanskaya on 27/12/2017.
 * https://www.youtube.com/watch?v=NWXEtQLwAt4
 */
public class Sortings {
    public static void main(String[] args){
        int[] array = {9, 6, 0, 4, 3, 7, 2, 1, 10, 8, 5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(insertSort(array)));

    }

    protected static int[] insertSort(int[] array){
        for (int i=1; i < array.length; i++){
            int temp = array[i];
            int prev = i-i;

            while(prev >=0 && array[prev] > temp) {
                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev+1] = temp;
        }

        return array;

    }
}
