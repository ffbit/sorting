package ffbit.sorting;


public class SelectionSorter {
    
    public SelectionSorter() {}

    public void sort(int[] sources) {
        final int length = sources.length;
        
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i; j < length; j++) {
                if (sources[j] < sources[i]) {
                    min = j;
                }
            }
            
            if (min != i) {
                int tmp = sources[i];
                sources[i] = sources[min];
                sources[min] = tmp;
            }
        }
    }
    
}
