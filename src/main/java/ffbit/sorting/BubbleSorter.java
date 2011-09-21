package ffbit.sorting;

public class BubbleSorter {
    
    public BubbleSorter() {}
    
    public void sort(int[] sources) {
        for (int i = 0; i < sources.length; i++) {
            for (int j = sources.length - 1; j > 0; j--) {
                if (sources[j] < sources[j - 1]) {
                    swap(sources, j);
                }
            }
        }
    }

    private void swap(int[] sources, int j) {
        int buffer = sources[j];
        sources[j] = sources[j - 1];
        sources[j - 1] = buffer;
    }
    
}
