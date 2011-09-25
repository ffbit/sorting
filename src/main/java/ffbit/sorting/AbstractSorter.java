package ffbit.sorting;

public abstract class AbstractSorter implements Sorter {

    protected final void swap(int[] source, int from, int to) {
        int tmp = source[from];
        source[from] = source[to];
        source[to] = tmp;
    }

}
