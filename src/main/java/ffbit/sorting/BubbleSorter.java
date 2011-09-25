package ffbit.sorting;

public class BubbleSorter extends AbstractSorter {
    
    public BubbleSorter() {}
    
    @Override
    public void sort(int[] sources) {
        for (int i = 0; i < sources.length; i++) {
            for (int j = sources.length - 1; j > 0; j--) {
                if (sources[j] < sources[j - 1]) {
                    swap(sources, j, j - 1);
                }
            }
        }
    }
    
}
