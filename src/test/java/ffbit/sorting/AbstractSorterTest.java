package ffbit.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AbstractSorterTest {
    
    @Test
    public void testSwap() {
        AbstractSorter sorter = new AbstractSorter();
        int[] source = {1, 2};
        sorter.swap(source, 0, 1);
        int[] expecteds = {2, 1};
        assertArrayEquals(expecteds, source);
    }
    
}
