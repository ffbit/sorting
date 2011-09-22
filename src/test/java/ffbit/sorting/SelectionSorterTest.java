package ffbit.sorting;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SelectionSorterTest {
    private int[] sources;
    private int[] expecteds;
    private SelectionSorter sorter;
    
    public SelectionSorterTest(int[] sources, int[] expecteds) {
        this.sources = sources;
        this.expecteds = expecteds;
    }
    
    @Parameters
    public static Collection<?> init() {
        return Arrays.asList(new Object[][] {
                {new int[] {2, 1}, new int[] {1, 2}},
                {new int[] {3, 2, 1}, new int[] {1, 2, 3}},
                {new int[] {7, 3, 2, 6, 1}, new int[] {1, 2, 3, 6, 7}},
                {new int[] {2, 2, 2, 1, 1, 3, 3}, new int[] {1, 1, 2, 2, 2, 3, 3}}
        });
    }
    
    @Before
    public void initSorter() {
        sorter = new SelectionSorter();
    }

    @Test
    public void testSort() {
        sorter.sort(sources);
        assertArrayEquals(expecteds, sources);
    }
    
}
