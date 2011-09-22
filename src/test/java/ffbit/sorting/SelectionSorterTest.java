package ffbit.sorting;

import org.junit.Before;

public class SelectionSorterTest extends SorterTest {
    
    public SelectionSorterTest(int[] sources, int[] expecteds) {
        super(sources, expecteds);
    }

    @Before
    @Override
    public void initSorter() {
        sorter = new SelectionSorter();
    }
    
}
