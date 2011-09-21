package ffbit.sorting;


public class SelectionSorter {
    
    public SelectionSorter() {}

    public void sort(int[] sources) {
        final int length = sources.length;
        int fromIndex = 0;
        
        while (fromIndex < length) {
            final int currentValue = sources[fromIndex];
            int minValue = currentValue;
            int swapIndex = fromIndex;
            
            for (int i = fromIndex; i < length; i++) {
                if (sources[i] < minValue) {
                    minValue = sources[i];
                    swapIndex = i;
                }
            }
            
            if (minValue < currentValue) {
                sources[fromIndex] = minValue;
                sources[swapIndex] = currentValue;
            }
            
            fromIndex++;
        }
    }
    
}
