package ffbit.sorting;

import org.junit.Before;

public class BubbleSorterTest extends SorterTest {
    
    public BubbleSorterTest(int[] sources, int[] expecteds) {
        super(sources, expecteds);
    }

    @Before
    @Override
    public void initSorter() {
        sorter = new BubbleSorter();
    }
    
}
