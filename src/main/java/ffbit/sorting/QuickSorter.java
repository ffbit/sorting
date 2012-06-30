package ffbit.sorting;

public class QuickSorter implements Sorter {

    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length);
    }

    private void sort(int[] array, int from, int to) {
        if (from >= to) {
            return;
        }

        int p = array[from];
        int i = from + 1;

        for (int j = from + 1; j < to; j++) {
            if (p >= array[j]) {
                swap(array, j, i);
                i++;
            }
        }

        if (from < i - 1) {
            swap(array, from, i - 1);
        }

        sort(array, i, to);
        sort(array, from, i - 1);
    }

    private void swap(int[] array, int from, int to) {
        int buffer = array[from];
        array[from] = array[to];
        array[to] = buffer;
    }

}
