import java.lang.reflect.Array;
import java.util.Arrays;

public class Sortings {

    public static void main(String [] args) {
        int[] array = {9, 6, 0, 4, 3, 7, 2, 1, 10, 8, 5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(insertSort(array)));

    }

    private static int[] insertSort(int[] array){
        for(int i=1; i< array.length; i++){
            int tempElement = array[i];
            int prevIndex = i-1;

            while(prevIndex >=0 && array[prevIndex] > tempElement) {
                array[prevIndex + 1] = array[prevIndex];
                prevIndex --;
            }
            array[prevIndex + 1] = tempElement;
        }
        return array;
    }
}
