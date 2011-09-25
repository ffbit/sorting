package ffbit.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AbstractSorterTest extends AbstractSorter {
    
    @Test
    public void testSwap() {
        AbstractSorter sorter = new AbstractSorterTest();
        int[] source = {1, 2};
        sorter.swap(source, 0, 1);
        int[] expecteds = {2, 1};
        assertArrayEquals(expecteds, source);
    }

    @Override
    public void sort(int[] array) {
        throw new UnsupportedOperationException("The method isn't implemented!");
    }
    
}
