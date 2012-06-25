package ffbit.sorting;

import java.util.Arrays;

public class MergeSorter implements Sorter {

    @Override
    public void sort(int[] array) {
        int length = array.length;

        if (length <= 1) {
            return;
        }

        int middle = length / 2;
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, array.length);

        sort(left);
        sort(right);

        int i = 0;
        int j = 0;
        for (int k = 0; k < length; k++) {
            if (i >= left.length) {
                array[k] = right[j++];
            } else if (j >= right.length) {
                array[k] = left[i++];
            } else {
                if (left[i] <= right[j]) {
                    array[k] = left[i++];
                } else {
                    array[k] = right[j++];
                }
            }
        }
    }
    
}
