package ffbit.sorting;


public class InsertionSorter extends AbstractSorter {

    @Override
    public void sort(int[] array) {
        final int length = array.length;
        
        for (int i = 0; i < length - 1; i++) {
            if (array[i] > array[i + 1]) {
                for (int j = i + 1; j > 0 && array[j] < array[j - 1]; j--) {
                    swap(array, j, j - 1);
                }
            }
        }
    }

}
