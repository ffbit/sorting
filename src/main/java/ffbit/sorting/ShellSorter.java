package ffbit.sorting;



public class ShellSorter extends AbstractSorter {

    @Override
    public void sort(int[] array) {
        final int length = array.length;
        int h = 1;
        
        while (h < length / 3) {
            h = h * 3 + 1;
        }
        
        while (h > 0) {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h && array[j] < array[j - h]; j -= h) {
                    swap(array, j, j - h);
                }
            }
            
            h = h / 3;
        }
    }

}
