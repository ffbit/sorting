package ffbit.sorting;


public class InsertionSorter implements Sorter {

    @Override
    public void sort(int[] array) {
        final int length = array.length;
        
        for (int i = 0; i < length - 1; i++) {
            if (array[i] > array[i + 1]) {
                for (int j = i + 1; j > 0 && array[j] < array[j - 1]; j--) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
    }

}
