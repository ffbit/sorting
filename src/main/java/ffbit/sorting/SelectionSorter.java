package ffbit.sorting;


public class SelectionSorter extends AbstractSorter {
    
    public SelectionSorter() {}
    
    @Override
    public void sort(int[] sources) {
        final int length = sources.length;
        
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (sources[j] < sources[min]) {
                    min = j;
                }
            }
            
            swap(sources, i, min);
        }
    }
    
}
